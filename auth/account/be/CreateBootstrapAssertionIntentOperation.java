package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atzs;
import defpackage.dffq;
import defpackage.dgng;
import defpackage.dgnh;
import defpackage.dhmr;
import defpackage.ekvl;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CreateBootstrapAssertionIntentOperation extends IntentOperation {
    private dgnh a;

    public CreateBootstrapAssertionIntentOperation() {
    }

    private static final Message a(String str) {
        Message obtain = Message.obtain((Handler) null, 1001);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = CreateBootstrapAssertionIntentOperation.class.getClassLoader();
        ekvl.y(classLoader);
        bundle.setClassLoader(classLoader);
        bundle.putString("errorMsg", str);
        obtain.setData(bundle);
        return obtain;
    }

    private static final Message b(Exception exc, String str) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return a(str);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aszs aszsVar = dffq.a;
        this.a = new atad((Context) this, (byte[]) null);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Message b;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.w("Auth", String.format(Locale.US, "[CreateBootstrapAssertionIntentOperation] Unable to get intent bundle", new Object[0]));
            return;
        }
        Messenger messenger = (Messenger) extras.get("messenger");
        if (messenger == null) {
            Log.w("Auth", String.format(Locale.US, "[CreateBootstrapAssertionIntentOperation] Missing a messenger, unable to bootstrap", new Object[0]));
            return;
        }
        try {
            if (!"com.google.android.gms.auth.account.be.create_bootstrap_assertion".equals(intent.getAction())) {
                messenger.send(a("Unknown action"));
                return;
            }
            Account account = (Account) intent.getParcelableExtra("bootstrapAccount");
            if (account == null) {
                messenger.send(a("No bootstrap account"));
                return;
            }
            try {
                UserBootstrapInfo[] userBootstrapInfoArr = (UserBootstrapInfo[]) dhmr.n(this.a.aA(new Account[]{account}));
                if (userBootstrapInfoArr == null || userBootstrapInfoArr.length <= 0) {
                    b = a("No bootstrap infos");
                } else {
                    try {
                        Challenge[] challengeArr = (Challenge[]) dhmr.n(this.a.az(userBootstrapInfoArr));
                        if (challengeArr == null || challengeArr.length <= 0) {
                            b = a("No challenges");
                        } else {
                            try {
                                Assertion[] assertionArr = (Assertion[]) dhmr.n(this.a.aw(challengeArr, false, true));
                                if (assertionArr == null || assertionArr.length <= 0) {
                                    b = a("No assertions");
                                } else {
                                    try {
                                        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) dhmr.n(this.a.ay(assertionArr));
                                        if (exchangeAssertionsForUserCredentialsRequest == null) {
                                            b = a("Error generating partial request.");
                                        } else {
                                            try {
                                                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) dhmr.n(this.a.aB(exchangeAssertionsForUserCredentialsRequest));
                                                if (exchangeAssertionsForUserCredentialsRequest2 == null) {
                                                    b = a("Error populating source device info");
                                                } else {
                                                    Message obtain = Message.obtain((Handler) null, 1);
                                                    Bundle bundle = new Bundle();
                                                    bundle.putByteArray("bootstrapAssertion", atzs.n(exchangeAssertionsForUserCredentialsRequest2));
                                                    obtain.setData(bundle);
                                                    b = obtain;
                                                }
                                            } catch (InterruptedException e) {
                                                e = e;
                                                b = b(e, "Error calling api to populate source device info");
                                                messenger.send(b);
                                            } catch (ExecutionException e2) {
                                                e = e2;
                                                b = b(e, "Error calling api to populate source device info");
                                                messenger.send(b);
                                            }
                                        }
                                    } catch (InterruptedException e3) {
                                        e = e3;
                                        b = b(e, "Error calling api to generate partial request");
                                        messenger.send(b);
                                    } catch (ExecutionException e4) {
                                        e = e4;
                                        b = b(e, "Error calling api to generate partial request");
                                        messenger.send(b);
                                    }
                                }
                            } catch (InterruptedException e5) {
                                e = e5;
                                b = b(e, "Error calling api to get assertions");
                                messenger.send(b);
                            } catch (ExecutionException e6) {
                                e = e6;
                                b = b(e, "Error calling api to get assertions");
                                messenger.send(b);
                            }
                        }
                    } catch (InterruptedException e7) {
                        e = e7;
                        b = b(e, "Error calling api to get challenges");
                        messenger.send(b);
                    } catch (ExecutionException e8) {
                        e = e8;
                        b = b(e, "Error calling api to get challenges");
                        messenger.send(b);
                    }
                }
            } catch (InterruptedException e9) {
                e = e9;
                b = b(e, "Error calling api to get bootstrap info");
                messenger.send(b);
            } catch (ExecutionException e10) {
                e = e10;
                b = b(e, "Error calling api to get bootstrap info");
                messenger.send(b);
            }
            messenger.send(b);
        } catch (RemoteException e11) {
            Log.e("Auth", String.format(Locale.US, "[CreateBootstrapAssertionIntentOperation] Exception sending message: ", new Object[0]), e11);
        }
    }

    CreateBootstrapAssertionIntentOperation(dgng dgngVar, dgnh dgnhVar) {
        this.a = dgnhVar;
    }
}
