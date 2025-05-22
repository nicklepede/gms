package com.google.android.gms.wallet.ow;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.wallet.analytics.events.CreateWalletObjectsEvent;
import com.google.android.gms.wallet.common.ui.AccountSelector;
import com.google.android.gms.wallet.common.ui.ButtonBar;
import com.google.android.gms.wallet.common.ui.TopBarView;
import com.google.android.gms.wallet.ow.RootChimeraActivity;
import com.google.android.gms.wallet.service.ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.dhkm;
import defpackage.dhlm;
import defpackage.dhln;
import defpackage.dhlp;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhly;
import defpackage.dhmd;
import defpackage.dhme;
import defpackage.dhmf;
import defpackage.dhmi;
import defpackage.dkqr;
import defpackage.dksf;
import defpackage.dkvu;
import defpackage.dkwx;
import defpackage.dkwy;
import defpackage.dkxo;
import defpackage.dkxq;
import defpackage.dkxr;
import defpackage.dkyr;
import defpackage.dlei;
import defpackage.dlfh;
import defpackage.dlfo;
import defpackage.dloy;
import defpackage.dlpa;
import defpackage.dlpc;
import defpackage.dlpe;
import defpackage.ehqn;
import defpackage.eihd;
import defpackage.eihe;
import defpackage.eoqt;
import defpackage.exbg;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgtg;
import defpackage.rhf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RootChimeraActivity extends rhf implements View.OnClickListener, dkxo, eihd, dkqr {
    public static final String a = dkxr.b("createWalletObjects");
    public boolean b;
    public boolean c;
    public ButtonBar d;
    public View e;
    public View f;
    public TopBarView g;
    public Account h;
    dhkm i;
    private eihe j;
    private String k;
    private String l;
    private String m;
    private exbg n;
    private boolean o;
    private boolean q;
    private BuyFlowConfig r;
    private HashSet s;
    private int p = -1;
    private final dlfo t = new dlei(this);

    private final dkxr n() {
        return (dkxr) getSupportFragmentManager().findFragmentByTag(a);
    }

    private final void o() {
        if (!dlpe.a(this)) {
            j();
            return;
        }
        if (!this.s.contains(this.h)) {
            this.s.add(this.h);
            getSupportFragmentManager().beginTransaction().add(dkxq.a(this.h, dlpc.e(this.r.b)), "RetrieveAuthTokensFragment").commit();
        }
        if (this.c) {
            this.f.setVisibility(8);
            this.e.setVisibility(0);
            q();
        }
    }

    private final void p() {
        if (n() != null) {
            Log.e("RootChimeraActivity", "Creating a new TransactionRetainerFragment when one already exists.");
        }
        getSupportFragmentManager().beginTransaction().add(dkxr.a(2, this.r, this.h), a).commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    private final void q() {
        this.o = true;
        u();
        dlfh dlfhVar = n().b;
        exbg exbgVar = this.n;
        atzb.m(dlfhVar.G(), "Must specify connection to OwIntService!");
        if (dlfhVar.g(exbgVar)) {
            return;
        }
        Message.obtain(dlfhVar.u, 18, new CreateWalletObjectsServiceRequest(dlfhVar.b, exbgVar)).sendToTarget();
    }

    private final void r() {
        fgrc v = eoqt.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eoqt eoqtVar = (eoqt) v.b;
        eoqtVar.c = 3;
        eoqtVar.b |= 1;
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        if (!v.b.L()) {
            v.U();
        }
        eoqt eoqtVar2 = (eoqt) v.b;
        stringExtra.getClass();
        eoqtVar2.b |= 2;
        eoqtVar2.d = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eoqt eoqtVar3 = (eoqt) fgriVar;
        stringExtra2.getClass();
        eoqtVar3.b |= 4;
        eoqtVar3.e = stringExtra2;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eoqt eoqtVar4 = (eoqt) fgriVar2;
        eoqtVar4.f = 1;
        eoqtVar4.b |= 8;
        if (!fgriVar2.L()) {
            v.U();
        }
        eoqt eoqtVar5 = (eoqt) v.b;
        eoqtVar5.g = 0;
        eoqtVar5.b |= 16;
        CreateWalletObjectsEvent.b(this, this.r, (eoqt) v.Q());
        i(0, null);
    }

    private final void s() {
        if (n() == null || this.q) {
            return;
        }
        this.q = true;
        n().b.d(this.t, this.p);
        this.p = -1;
    }

    private final void t() {
        if (this.p >= 0 || n() == null) {
            return;
        }
        this.q = false;
        this.p = n().b.a(this.t);
    }

    private final void u() {
        this.d.a(!this.o);
        this.g.b(!this.o);
    }

    @Override // defpackage.dkxo
    public final void ac() {
        r();
    }

    @Override // defpackage.dkxo
    public final void ad(int i) {
        if (i == 3) {
            f(7);
        } else {
            f(411);
        }
    }

    @Override // defpackage.dkxo
    public final void ae() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    @Override // defpackage.eihd
    public final void ak(int i, int i2) {
        if (i2 != 1000) {
            Log.e("RootChimeraActivity", a.j(i2, "Unknown error dialog error code: "));
        } else if (i != 1) {
            r();
        } else {
            o();
        }
    }

    public final void e() {
        dkwx[] dkwxVarArr;
        RootChimeraActivity rootChimeraActivity;
        if (!this.o) {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
        }
        if (this.h == null) {
            Account account = this.r.b.b;
            this.h = account;
            this.g.a(account);
        }
        TopBarView topBarView = this.g;
        AccountSelector accountSelector = topBarView.a;
        if (accountSelector != null) {
            dksf.a();
            Account[] c = dksf.c(topBarView.getContext());
            if (c == null) {
                dkwxVarArr = null;
            } else {
                int length = c.length;
                dkwx[] dkwxVarArr2 = new dkwx[length];
                for (int i = 0; i < length; i++) {
                    dkwxVarArr2[i] = new dkwx(c[i]);
                }
                dkwxVarArr = dkwxVarArr2;
            }
            int length2 = dkwxVarArr.length;
            if (length2 > 1) {
                accountSelector.b.setAdapter((SpinnerAdapter) new dkwy(accountSelector.getContext(), dkwxVarArr));
                accountSelector.b.setVisibility(0);
            } else {
                if (length2 == 1) {
                    accountSelector.a = dkwxVarArr[0].a;
                }
                accountSelector.b.setVisibility(8);
            }
            accountSelector.b();
            if (length2 == 1 && (rootChimeraActivity = accountSelector.c) != null) {
                rootChimeraActivity.g(accountSelector.a);
            }
            accountSelector.c = this;
        }
        if (n() == null) {
            p();
        }
        s();
        if (this.o || this.b) {
            return;
        }
        o();
    }

    public final void f(int i) {
        Intent intent = new Intent();
        dkvu.b(this.r, intent, i);
        m(5);
        i(1, intent);
    }

    public final void g(Account account) {
        if (atyq.b(account, this.h)) {
            return;
        }
        getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_GOOGLE_TRANSACTION_ID");
        getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_INSTRUMENT_ID");
        getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_ADDRESS_ID");
        this.h = account;
        t();
        dkxr n = n();
        if (n != null) {
            getSupportFragmentManager().beginTransaction().remove(n).commit();
        }
        getSupportFragmentManager().executePendingTransactions();
        dlpa b = BuyFlowConfig.b(this.r);
        dloy b2 = ApplicationParameters.b(this.r.b);
        b2.d(account);
        b.b(b2.a);
        this.r = b.a();
        p();
        s();
        o();
    }

    public final void i(int i, Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        setResult(i, intent);
        finish();
    }

    public final void j() {
        if (this.j != null) {
            getSupportFragmentManager().beginTransaction().remove(this.j).commit();
        }
        eihe d = eihe.d();
        this.j = d;
        d.a = this;
        d.show(getSupportFragmentManager(), "RootChimeraActivity.NETWORK_ERROR_DIALOG");
    }

    @Override // defpackage.dkqr
    public final BuyFlowConfig l() {
        return this.r;
    }

    @Override // defpackage.efzb
    public final Account ll() {
        return this.h;
    }

    public final void m(int i) {
        fgrc v = eoqt.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eoqt eoqtVar = (eoqt) fgriVar;
        eoqtVar.c = i - 1;
        eoqtVar.b |= 1;
        String str = this.l;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eoqt eoqtVar2 = (eoqt) fgriVar2;
        str.getClass();
        eoqtVar2.b |= 2;
        eoqtVar2.d = str;
        String str2 = this.k;
        if (!fgriVar2.L()) {
            v.U();
        }
        eoqt eoqtVar3 = (eoqt) v.b;
        str2.getClass();
        eoqtVar3.b |= 4;
        eoqtVar3.e = str2;
        int i2 = getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0) == 1 ? 3 : 2;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        eoqt eoqtVar4 = (eoqt) fgriVar3;
        eoqtVar4.f = i2 - 1;
        eoqtVar4.b |= 8;
        if (i == 2) {
            int i3 = true == this.c ? 3 : 2;
            if (!fgriVar3.L()) {
                v.U();
            }
            eoqt eoqtVar5 = (eoqt) v.b;
            eoqtVar5.g = i3 - 1;
            eoqtVar5.b |= 16;
        }
        CreateWalletObjectsEvent.b(this, this.r, (eoqt) v.Q());
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.c) {
            i(-1, null);
        } else {
            r();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.positive_btn) {
            q();
        } else if (this.c) {
            i(-1, new Intent());
        } else {
            r();
        }
    }

    @Override // defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        String string;
        String string2;
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        this.r = buyFlowConfig;
        atzb.s(buyFlowConfig);
        super.onCreate(bundle);
        dkyr.C(this, this.r, dkyr.a, false);
        setContentView(R.layout.wallet_activity_simple_dialog);
        if (this.i == null) {
            this.i = new dhkm(this);
        }
        ButtonBar buttonBar = (ButtonBar) findViewById(R.id.button_bar);
        this.d = buttonBar;
        buttonBar.a.setOnClickListener(this);
        this.d.c.setOnClickListener(this);
        this.e = findViewById(R.id.overlay_progress_spinner);
        this.f = findViewById(R.id.dialog_content);
        this.g = (TopBarView) findViewById(R.id.top_bar);
        u();
        setTitle(R.string.common_google_pay_icon_with_text_content_description);
        this.s = new HashSet();
        atzb.s(this.r.b);
        atzb.s(this.r.b.b);
        if (bundle != null) {
            this.p = bundle.getInt("serviceConnectionSavePoint", -1);
            this.o = bundle.getBoolean("remoteOperationInProgress", false);
            this.b = bundle.getBoolean("immediateSaveFinished", false);
            this.h = (Account) bundle.getParcelable("account");
            if (bundle.containsKey("accountsThatHaveRequestedAuthTokens")) {
                this.s.addAll(bundle.getParcelableArrayList("accountsThatHaveRequestedAuthTokens"));
            }
        }
        this.n = (exbg) ehqn.b(getIntent(), "com.google.android.gms.wallet.CREATE_WALLET_OBJECTS_REQUEST", (fgtg) exbg.a.iQ(7, null));
        this.l = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        this.k = getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        this.m = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_OBJECT_DESCRIPTION");
        int intExtra = getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0);
        dksf.a();
        this.c = intExtra == 1 && dksf.c(this).length == 1;
        TextView textView = (TextView) findViewById(R.id.confirmation_text);
        if (this.c) {
            this.d.c.setText(getString(R.string.common_got_it));
            this.d.b.setVisibility(8);
            if (this.n.d.size() > 0) {
                string2 = getString(R.string.wallet_saved_loyalty_or_gift_card_wallet_object_message, new Object[]{this.m});
            } else if (this.n.e.size() > 0) {
                string2 = getString(R.string.wallet_saved_offer_wallet_object_message, new Object[]{this.l});
            } else {
                if (this.n.f.size() <= 0) {
                    throw new IllegalStateException("CreateWalletObjectRequest should contain an offer, loyalty, or gift card object");
                }
                string2 = getString(R.string.wallet_saved_loyalty_or_gift_card_wallet_object_message, new Object[]{this.l});
            }
            textView.setText(string2);
        } else {
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{R.attr.colorWalletNormalText});
            int color = obtainStyledAttributes.getColor(0, -16777216);
            obtainStyledAttributes.recycle();
            this.d.c.setTextColor(color);
            if (this.n.d.size() > 0) {
                string = getString(R.string.wallet_confirm_loyalty_or_gift_wallet_object_creation, new Object[]{this.m});
            } else if (this.n.e.size() > 0) {
                string = getString(R.string.wallet_confirm_offer_wallet_object_creation, new Object[]{this.l});
            } else {
                if (this.n.f.size() <= 0) {
                    throw new IllegalStateException("CreateWalletObjectRequest should contain an offer, loyalty, or gift card object");
                }
                string = getString(R.string.wallet_confirm_loyalty_or_gift_wallet_object_creation, new Object[]{this.l});
            }
            textView.setText(string);
        }
        if (this.o && this.c) {
            this.f.setVisibility(8);
            this.e.setVisibility(0);
        }
        if (this.h != null) {
            e();
            return;
        }
        this.e.setVisibility(0);
        dhlw e = this.i.e();
        dhlq dhlqVar = new dhlq() { // from class: dleg
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                String str;
                RootChimeraActivity rootChimeraActivity = RootChimeraActivity.this;
                AccountInfo accountInfo = (AccountInfo) obj;
                if (accountInfo != null && (str = accountInfo.b) != null) {
                    rootChimeraActivity.h = new Account(str, "com.google");
                    rootChimeraActivity.g.a(rootChimeraActivity.h);
                }
                rootChimeraActivity.e();
            }
        };
        Executor executor = dhmd.a;
        dhlp dhlpVar = new dhlp(dhmi.a(executor), dhlqVar);
        dhmf dhmfVar = (dhmf) e;
        dhly dhlyVar = dhmfVar.b;
        dhlyVar.a(dhlpVar);
        dhme.c(this).g(dhlpVar);
        dhmfVar.A();
        dhlm dhlmVar = new dhlm(dhmi.a(executor), new dhln() { // from class: dleh
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                RootChimeraActivity.this.e();
            }
        });
        dhlyVar.a(dhlmVar);
        dhme.c(this).g(dhlmVar);
        dhmfVar.A();
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        t();
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        eihe eiheVar = (eihe) getSupportFragmentManager().findFragmentByTag("RootChimeraActivity.NETWORK_ERROR_DIALOG");
        this.j = eiheVar;
        if (eiheVar != null) {
            eiheVar.a = this;
        }
        s();
    }

    @Override // defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.h);
        bundle.putParcelableArrayList("accountsThatHaveRequestedAuthTokens", new ArrayList<>(this.s));
        t();
        bundle.putInt("serviceConnectionSavePoint", this.p);
        bundle.putBoolean("remoteOperationInProgress", this.o);
        bundle.putBoolean("immediateSaveFinished", this.b);
    }
}
