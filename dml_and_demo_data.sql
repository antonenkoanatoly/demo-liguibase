create table ticket (
  id          identity not null auto_increment,
  payout      double   not null,
  is_paid_out boolean  not null
);

insert into ticket(payout, is_paid_out) values (1.5, false);
insert into ticket(payout, is_paid_out) values (0.5, true);
insert into ticket(payout, is_paid_out) values (2.5, false);
insert into ticket(payout, is_paid_out) values (4.5, true);