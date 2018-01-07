//package cm.aptoide.pt.ethereumj.solidity.contract;
//
//import java.math.BigInteger;
//import org.web3j.abi.datatypes.Address;
//import org.web3j.abi.datatypes.generated.Uint192;
//import org.web3j.abi.datatypes.generated.Uint256;
//import org.web3j.abi.datatypes.generated.Uint32;
//
///**
// * Created by neuro on 03-01-2018.
// */
//
//public class RaidenMicroTransferChannelsLOL {
//
//  private static final Uint256 CHANNEL_DEPOSIT_BUGBOUNTY_LIMIT = new Uint256(
//      new BigInteger("10").pow(18)
//          .multiply(BigInteger.valueOf(100)));
//
//  private {
//    require(_deposit <= channel_deposit_bugbounty_limit);
//
//    uint32 open_block_number = uint32(block.number);
//
//    // Create unique identifier from sender, receiver and current block number
//    bytes32 key = getKey(_sender_address, _receiver_address, open_block_number);
//
//    require(channels[key].deposit == 0);
//    require(channels[key].open_block_number == 0);
//    require(closing_requests[key].settle_block_number == 0);
//
//    // Store channel information
//    channels[key] = Channel({ deposit:_deposit, open_block_number:open_block_number});
//    ChannelCreated(_sender_address, _receiver_address, _deposit);
//  }
//
//  /// @notice Creates a new channel between `sender` and `receiver` and transfers
//  /// the `deposit` token deposit to this contract, compatibility with ERC20 tokens.
//  /// @param _receiver_address The address that receives tokens.
//  /// @param deposit The amount of tokens that the sender escrows.
//  void createChannelERC20(Address sender, Address receiver, Uint192 deposit) {
//    createChannelPrivate(sender, receiver, deposit);
//
//    // transferFrom deposit from sender to contract
//    // ! needs prior approval from user
//    require(token.transferFrom(msg.sender, address(this), deposit));
//  }
//
//  /// @dev Creates a new channel between a sender and a receiver.
//  /// @param sender The address that sends tokens.
//  /// @param receiver The address that receives tokens.
//  /// @param _deposit The amount of tokens that the sender escrows.
//  void createChannelPrivate(Address sender, Address receiver, Uint192 deposit) {
//    if (deposit.getValue()
//        .compareTo(CHANNEL_DEPOSIT_BUGBOUNTY_LIMIT.getValue()) < 0) {
//      throw new IllegalStateException("Deposit lower than CHANNEL_DEPOSIT_BUGBOUNTY_LIMIT!");
//    }
//
//    Uint32 openBlockNumber = new Uint32(getOpenBlockNumber());
//  }
//}
