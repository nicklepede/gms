package com.google.android.gms.wallet.selector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.atzb;
import defpackage.dkqk;
import defpackage.dkvx;
import defpackage.dkyr;
import defpackage.dlfg;
import defpackage.ehqn;
import defpackage.ekqj;
import defpackage.ekqm;
import defpackage.eosb;
import defpackage.fgpr;
import defpackage.fgtg;
import defpackage.fvty;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InitializeGenericSelectorRootChimeraActivity extends dkqk {
    private byte[] h;
    private int i = 1;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        atzb.s(buyFlowConfig);
        atzb.s(buyFlowConfig.b);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.selector.InitializeGenericSelectorRootActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("com.google.android.gms.wallet.account", buyFlowConfig.b.b);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        dlfg dlfgVar;
        dkyr.C(this, l(), dkyr.e, true);
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        q(bundle, (i2 == 1 || i2 == 2) ? true : i2 != 3 ? fvty.a.lK().j() : fvty.a.lK().h(), 10, eosb.FLOW_TYPE_GENERIC_SELECTOR);
        super.onCreate(bundle);
        this.i = ekqj.a(getIntent().getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_GENERIC_SELECTOR_SCENARIO", 2));
        this.h = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        if (dkyr.V(this.i)) {
            atzb.t(this.h, "GenericSelectorParameters are required.");
        }
        if (bundle == null) {
            atzb.l((getIntent().hasExtra("com.google.android.gms.identity.intents.EXTRA_REQUEST") && getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_COUNTRY_CODE")) ? false : true);
        }
        setContentView(R.layout.wallet_activity_initialize_generic_selector);
        d((Toolbar) findViewById(R.id.tool_bar));
        kY().o(true);
        findViewById(R.id.wallet_root);
        if (((dlfg) m()) == null) {
            if (getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN")) {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
                BuyFlowConfig l = l();
                int i3 = this.i;
                byte[] bArr = this.h;
                String str = this.a;
                LogContext logContext = this.b;
                if (dkyr.V(i3)) {
                    atzb.s(bArr);
                }
                atzb.s(byteArrayExtra);
                ekqm ekqmVar = (ekqm) ehqn.c(byteArrayExtra, (fgtg) ekqm.a.iQ(7, null));
                dlfgVar = new dlfg();
                Bundle bY = dlfg.bY(l, str, logContext);
                bY.putByteArray("genericParameters", bArr);
                ehqn.j(bY, "initializeToken", ekqmVar);
                dlfgVar.setArguments(bY);
            } else {
                BuyFlowConfig l2 = l();
                byte[] bArr2 = this.h;
                String str2 = this.a;
                LogContext logContext2 = this.b;
                atzb.s(bArr2);
                dlfg dlfgVar2 = new dlfg();
                Bundle bY2 = dlfg.bY(l2, str2, logContext2);
                bY2.putByteArray("genericParameters", bArr2);
                dlfgVar2.setArguments(bY2);
                dlfgVar = dlfgVar2;
            }
            B(dlfgVar, R.id.selector_fragment_holder);
        }
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void w(int i) {
        Intent intent = new Intent();
        intent.putExtra("exitAction", 8);
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else if (i3 != 3) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        }
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void x(WalletExitResult walletExitResult) {
        Intent intent = new Intent();
        intent.putExtra("exitAction", 8);
        if (dkvx.a(l().c)) {
            walletExitResult.a().b(intent);
        }
        int i = walletExitResult.e;
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else if (i3 != 3) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", i);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
            H(1, intent);
        }
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final /* bridge */ /* synthetic */ void z(Parcelable parcelable, boolean z) {
        GenericSelectorResult genericSelectorResult = (GenericSelectorResult) parcelable;
        Intent T = T(z);
        if (genericSelectorResult != null) {
            if (genericSelectorResult.b()) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", genericSelectorResult.f);
            }
            if (genericSelectorResult.c()) {
                T.putExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS", genericSelectorResult.b);
            }
            if (!genericSelectorResult.c() && !genericSelectorResult.b()) {
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_ID", genericSelectorResult.c);
                T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_NEW_CUSTOMER", genericSelectorResult.d);
                fgpr fgprVar = genericSelectorResult.e;
                if (fgprVar != null) {
                    T.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_OPTION_TOKEN", fgprVar.M());
                }
            }
        }
        H(-1, T);
    }
}
