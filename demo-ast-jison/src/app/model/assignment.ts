import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";

export class Assignment extends Instruction {
  id: string;
  operation: Instruction;

  constructor(
    line: number,
    column: number,
    id: string,
    operation: Instruction
  ) {
    super(line, column);
    this.id = id;
    this.operation = operation;
  }

  run(table: SymbolTable) {
  }
}
