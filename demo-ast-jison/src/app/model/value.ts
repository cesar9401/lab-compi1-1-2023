import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";

export class Value extends Instruction {
  value: any;
  type: ValueType

  constructor(
    line: number,
    column: number,
    value: any,
    type: ValueType
  ) {
    super(line, column);
    this.value = value;
    this.type = type;
  }

  run(table: SymbolTable): any {
  }
}

export enum ValueType {
  INTEGER,
  DECIMAL,
  ID
}
