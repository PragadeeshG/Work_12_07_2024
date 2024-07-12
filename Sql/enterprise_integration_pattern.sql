create table if not exists enterprise_integration_pattern(
eip_patterns varchar(255) not null,
message_channel varchar(255) null,
mesage varchar(255) null,
pipes_and_filters varchar(255) null,
message_routers varchar(255) null,
message_translator varchar(255) null,
message_end_point varchar(255) null,
transfer_status Integer null,
down_stream_app varchar(255) null,
notify_data varchar(255) null,
entity_state varchar(255) null,
constraint enterprise_integration_pattern_pk primary key(eip_patterns));