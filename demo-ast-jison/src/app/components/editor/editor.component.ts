import { Component, OnInit } from '@angular/core';
import { CodeModel } from "@ngstack/code-editor";

// declare var calculadora: any;
declare var calculadora2: any;

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css']
})
export class EditorComponent implements OnInit{
  theme = 'vs-dark';
  result = '';

  codeModel: CodeModel = {
    language: 'javascript',
    uri: 'main.js',
    value: ''
  };

  options = {
    contextmenu: true,
    minimap: {
      enabled: true
    },
    fontSize: 24
  };

  onCompile() {
    try {
      const value = calculadora2.parse(this.codeModel.value);
      this.result = `El resultado es: ${value}`;
    } catch(error) {
      console.error(error);
      this.result = 'Algo salio mal :(';
    }
  }

  ngOnInit(): void {
  }
}
