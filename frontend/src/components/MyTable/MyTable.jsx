import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

const useStyles = makeStyles({
  table: {
    minWidth: 2000,
  },
});

export default function DenseTable({ pessoas }) {
  const classes = useStyles();

  return (
    <TableContainer component={Paper}>
      <Table className={classes.table}>
        <TableHead>
          <TableRow>
            <TableCell>id</TableCell>
            <TableCell>Nome</TableCell>
            <TableCell>CPF</TableCell>
            <TableCell>Telefone</TableCell>
            <TableCell>Dia</TableCell>
            <TableCell>Mês</TableCell>
            <TableCell>Ano</TableCell>
            <TableCell>Email</TableCell>
            <TableCell>Senha</TableCell>
            <TableCell>CEP</TableCell>
            <TableCell>Estado</TableCell>
            <TableCell>Cidade</TableCell>
            <TableCell>Rua</TableCell>
            <TableCell>Número</TableCell>
            <TableCell>Complemento</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {pessoas.map((row) => (
            <TableRow key={row.id}>
              <TableCell component="th" scope="row">
                {row.id}
              </TableCell>
              <TableCell>{row.nome}</TableCell>
              <TableCell>{row.cpf}</TableCell>
              <TableCell>{row.telefone}</TableCell>
              <TableCell>{row.dia}</TableCell>
              <TableCell>{row.mes}</TableCell>
              <TableCell>{row.ano}</TableCell>
              <TableCell>{row.email}</TableCell>
              <TableCell>{row.senha}</TableCell>
              <TableCell>{row.cep}</TableCell>
              <TableCell>{row.estado}</TableCell>
              <TableCell>{row.cidade}</TableCell>
              <TableCell>{row.rua}</TableCell>
              <TableCell>{row.numero}</TableCell>
              <TableCell>{row.complemento}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}