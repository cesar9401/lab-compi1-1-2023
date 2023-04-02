import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";
import { Variable } from "src/app/model/variable";

export class Print extends Instruction {
  instruction: Instruction;

  constructor(
    line: number,
    column: number,
    instruction: Instruction
  ) {
    super(line, column);
    this.instruction = instruction;
  }

  run(table: SymbolTable) {
    const variable: Variable | undefined = this.instruction.run(table);
    if (!variable || variable.value == undefined) {
      throw new Error("la variable no tiene valor");
    }

    console.log(variable.value);
  }
}
