import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";
import { Variable } from "src/app/model/variable";

export class While extends Instruction {
  operation: Instruction;
  instructions: Instruction[]

  constructor(
    line: number,
    column: number,
    operation: Instruction,
    instructions: Instruction[]
  ) {
    super(line, column);
    this.operation = operation;
    this.instructions = instructions;
  }

  run(table: SymbolTable): any {
    let operation: Variable | undefined = this.operation.run(table);
    if (!operation || operation.value == undefined) {
      throw new Error("error en comparacion");
    }

    // TODO: verificar que sea tipo booleano
    while (operation.value) {
      const childTable = new SymbolTable(table);
      this.instructions.forEach(i => {
        i.run(childTable);
      });

      operation = this.operation.run(childTable);
      if (!operation || operation.value == undefined) {
        console.log(operation);
        throw new Error("error verificando condicion");
      }
    }
  }
}
