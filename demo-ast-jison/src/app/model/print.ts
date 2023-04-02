import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";

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
  }
}
