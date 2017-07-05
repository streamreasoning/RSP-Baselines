package it.polimi.rsp.baselines.rsp.query.response;

import it.polimi.data.Collectable;
import it.polimi.sr.rsp.RSPQuery;
import it.polimi.streaming.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class InstantaneousResponse implements Response, Collectable {

	private String id;
	private long creation_timestamp, cep_timestamp;
	private RSPQuery query;

	@Override
	public long getCreationTime() {
		return creation_timestamp;
	}

	@Override
	public String getQueryString() {
		return query.toString();
	}
}