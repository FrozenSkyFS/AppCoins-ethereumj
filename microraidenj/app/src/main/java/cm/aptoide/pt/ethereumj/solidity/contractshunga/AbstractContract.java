package cm.aptoide.pt.ethereumj.solidity.contract;

import cm.aptoide.pt.ethereumj.core.CallTransaction.Function;

/**
 * Created by neuro on 03-01-2018.
 */

public class AbstractContract {

  private final String method;
  private final String[] paramTypes;
  private final String[] resultTypes;
  private final String[] params;

  public AbstractContract(String method, String[] paramTypes, String[] params, String[] resultTypes) {
    this.method = method;
    this.paramTypes = paramTypes;
    this.params = params;
    this.resultTypes = resultTypes;
  }

  @Override public byte[] encode() {
    return Function.fromSignature(method, paramTypes, resultTypes)
        .encode(params);
  }
}
