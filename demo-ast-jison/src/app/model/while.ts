import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";

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
  }
}
