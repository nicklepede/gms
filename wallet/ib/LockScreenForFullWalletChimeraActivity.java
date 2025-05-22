package com.google.android.gms.wallet.ib;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.analytics.events.OwFullWalletRequestedEvent;
import com.google.android.gms.wallet.intentoperation.ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.ow.ShowLockScreenChimeraActivity;
import com.google.android.gms.wallet.service.ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzb;
import defpackage.dkox;
import defpackage.dkxr;
import defpackage.dlcn;
import defpackage.dlfo;
import defpackage.eors;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LockScreenForFullWalletChimeraActivity extends FragmentActivity {
    public static final /* synthetic */ int c = 0;
    private static final String d = dkxr.b("lockScreenForFullWallet");
    LoadFullWalletServiceRequest a;
    private BuyFlowConfig e;
    private boolean f;
    private int g;
    private dkxr h;
    int b = 1;
    private final dlfo i = new dlcn(this);

    private final void d() {
        g(4, -1, 1);
        e(0, null);
    }

    private final void e(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    private final void f() {
        if (this.g == -1) {
            this.g = a().b.a(this.i);
        }
    }

    private final void g(int i, int i2, int i3) {
        Account account = this.e.b.b;
        String str = account != null ? account.name : null;
        BuyFlowConfig buyFlowConfig = this.e;
        int i4 = i3 - 1;
        int i5 = this.b;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        OwFullWalletRequestedEvent.b(this, buyFlowConfig, i, i2, i4, 0, 0L, i6, str, this.a.b.a);
    }

    final dkxr a() {
        if (this.h == null) {
            this.h = (dkxr) getSupportFragmentManager().findFragmentByTag(d);
        }
        return this.h;
    }

    public final void b(LoadFullWalletServiceResponse loadFullWalletServiceResponse) {
        Bundle bundle = loadFullWalletServiceResponse.a;
        ConnectionResult connectionResult = new ConnectionResult(loadFullWalletServiceResponse.c, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (connectionResult.c()) {
            try {
                connectionResult.b(getContainerActivity(), 502);
                return;
            } catch (IntentSender.SendIntentException unused) {
                c(1014);
                return;
            }
        }
        Intent intent = new Intent();
        Bundle bundle2 = loadFullWalletServiceResponse.a;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        FullWallet fullWallet = loadFullWalletServiceResponse.b;
        if (fullWallet != null) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
        }
        int i = loadFullWalletServiceResponse.c;
        if (i != 0) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
        }
        e(i == 0 ? -1 : 1, intent);
    }

    public final void c(int i) {
        ReportErrorChimeraIntentOperation.a(this.e, this.a.b.a, 5, 8, i - 1, this);
        g(5, 8, i);
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 8);
        dkox a = FullWallet.a();
        a.a(this.a.b.a);
        a.b(this.a.b.b);
        intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", a.a);
        e(1, intent);
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 501) {
            if (i != 502) {
                super.onActivityResult(i, i2, intent);
                return;
            } else {
                e(i2, intent);
                return;
            }
        }
        this.b = 4;
        if (i2 == -1) {
            a().b.u(this.a);
        } else if (i2 == 0) {
            this.b = 3;
            d();
        } else {
            this.b = 5;
            c(1013);
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        d();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_Wallet_No_Display);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.e = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        this.a = (LoadFullWalletServiceRequest) intent.getParcelableExtra("loadFullWalletServiceRequest");
        atzb.t(this.e, "Buyflow config is required!");
        atzb.t(this.a, "request is required!");
        if (bundle != null) {
            this.f = bundle.getBoolean("startedLockscreenActivity");
            this.g = bundle.getInt("serviceConnectionSavePoint");
            this.b = eors.a(bundle.getInt("lockscreenStatus"));
        } else {
            this.f = false;
            this.g = -1;
            this.b = 1;
        }
        if (a() == null) {
            BuyFlowConfig buyFlowConfig = this.e;
            this.h = dkxr.a(8, buyFlowConfig, buyFlowConfig.b.b);
            getSupportFragmentManager().beginTransaction().add(this.h, d).commit();
        }
        setFinishOnTouchOutside(false);
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        f();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        a().b.d(this.i, this.g);
        this.g = -1;
        if (this.f) {
            return;
        }
        startActivityForResult(ShowLockScreenChimeraActivity.f(this.e), 501);
        this.f = true;
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f();
        bundle.putInt("serviceConnectionSavePoint", this.g);
        bundle.putBoolean("startedLockscreenActivity", this.f);
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("lockscreenStatus", i2);
    }
}
