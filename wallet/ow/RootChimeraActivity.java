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
import defpackage.arwb;
import defpackage.arwm;
import defpackage.dezg;
import defpackage.dfag;
import defpackage.dfah;
import defpackage.dfaj;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfas;
import defpackage.dfax;
import defpackage.dfay;
import defpackage.dfaz;
import defpackage.dfbc;
import defpackage.difg;
import defpackage.digu;
import defpackage.dikj;
import defpackage.dilm;
import defpackage.diln;
import defpackage.dimd;
import defpackage.dimf;
import defpackage.dimg;
import defpackage.ding;
import defpackage.disx;
import defpackage.ditw;
import defpackage.diud;
import defpackage.djdf;
import defpackage.djdh;
import defpackage.djdj;
import defpackage.djdl;
import defpackage.efdk;
import defpackage.efua;
import defpackage.efub;
import defpackage.emdf;
import defpackage.euln;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.feen;
import defpackage.pob;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RootChimeraActivity extends pob implements View.OnClickListener, dimd, efua, difg {
    public static final String a = dimg.b("createWalletObjects");
    public boolean b;
    public boolean c;
    public ButtonBar d;
    public View e;
    public View f;
    public TopBarView g;
    public Account h;
    dezg i;
    private efub j;
    private String k;
    private String l;
    private String m;
    private euln n;
    private boolean o;
    private boolean q;
    private BuyFlowConfig r;
    private HashSet s;
    private int p = -1;
    private final diud t = new disx(this);

    private final dimg n() {
        return (dimg) getSupportFragmentManager().findFragmentByTag(a);
    }

    private final void o() {
        if (!djdl.a(this)) {
            j();
            return;
        }
        if (!this.s.contains(this.h)) {
            this.s.add(this.h);
            getSupportFragmentManager().beginTransaction().add(dimf.a(this.h, djdj.e(this.r.b)), "RetrieveAuthTokensFragment").commit();
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
        getSupportFragmentManager().beginTransaction().add(dimg.a(2, this.r, this.h), a).commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    private final void q() {
        this.o = true;
        u();
        ditw ditwVar = n().b;
        euln eulnVar = this.n;
        arwm.m(ditwVar.G(), "Must specify connection to OwIntService!");
        if (ditwVar.g(eulnVar)) {
            return;
        }
        Message.obtain(ditwVar.u, 18, new CreateWalletObjectsServiceRequest(ditwVar.b, eulnVar)).sendToTarget();
    }

    private final void r() {
        fecj v = emdf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        emdf emdfVar = (emdf) v.b;
        emdfVar.c = 3;
        emdfVar.b |= 1;
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        if (!v.b.L()) {
            v.U();
        }
        emdf emdfVar2 = (emdf) v.b;
        stringExtra.getClass();
        emdfVar2.b |= 2;
        emdfVar2.d = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        emdf emdfVar3 = (emdf) fecpVar;
        stringExtra2.getClass();
        emdfVar3.b |= 4;
        emdfVar3.e = stringExtra2;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emdf emdfVar4 = (emdf) fecpVar2;
        emdfVar4.f = 1;
        emdfVar4.b |= 8;
        if (!fecpVar2.L()) {
            v.U();
        }
        emdf emdfVar5 = (emdf) v.b;
        emdfVar5.g = 0;
        emdfVar5.b |= 16;
        CreateWalletObjectsEvent.b(this, this.r, (emdf) v.Q());
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

    @Override // defpackage.dimd
    public final void ac() {
        r();
    }

    @Override // defpackage.dimd
    public final void ad(int i) {
        if (i == 3) {
            f(7);
        } else {
            f(411);
        }
    }

    @Override // defpackage.dimd
    public final void ae() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    @Override // defpackage.efua
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
        dilm[] dilmVarArr;
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
            digu.a();
            Account[] c = digu.c(topBarView.getContext());
            if (c == null) {
                dilmVarArr = null;
            } else {
                int length = c.length;
                dilm[] dilmVarArr2 = new dilm[length];
                for (int i = 0; i < length; i++) {
                    dilmVarArr2[i] = new dilm(c[i]);
                }
                dilmVarArr = dilmVarArr2;
            }
            int length2 = dilmVarArr.length;
            if (length2 > 1) {
                accountSelector.b.setAdapter((SpinnerAdapter) new diln(accountSelector.getContext(), dilmVarArr));
                accountSelector.b.setVisibility(0);
            } else {
                if (length2 == 1) {
                    accountSelector.a = dilmVarArr[0].a;
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
        dikj.b(this.r, intent, i);
        m(5);
        i(1, intent);
    }

    public final void g(Account account) {
        if (arwb.b(account, this.h)) {
            return;
        }
        getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_GOOGLE_TRANSACTION_ID");
        getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_INSTRUMENT_ID");
        getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_ADDRESS_ID");
        this.h = account;
        t();
        dimg n = n();
        if (n != null) {
            getSupportFragmentManager().beginTransaction().remove(n).commit();
        }
        getSupportFragmentManager().executePendingTransactions();
        djdh b = BuyFlowConfig.b(this.r);
        djdf b2 = ApplicationParameters.b(this.r.b);
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
        efub d = efub.d();
        this.j = d;
        d.a = this;
        d.show(getSupportFragmentManager(), "RootChimeraActivity.NETWORK_ERROR_DIALOG");
    }

    @Override // defpackage.edmf
    public final Account kW() {
        return this.h;
    }

    @Override // defpackage.difg
    public final BuyFlowConfig l() {
        return this.r;
    }

    public final void m(int i) {
        fecj v = emdf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        emdf emdfVar = (emdf) fecpVar;
        emdfVar.c = i - 1;
        emdfVar.b |= 1;
        String str = this.l;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emdf emdfVar2 = (emdf) fecpVar2;
        str.getClass();
        emdfVar2.b |= 2;
        emdfVar2.d = str;
        String str2 = this.k;
        if (!fecpVar2.L()) {
            v.U();
        }
        emdf emdfVar3 = (emdf) v.b;
        str2.getClass();
        emdfVar3.b |= 4;
        emdfVar3.e = str2;
        int i2 = getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0) == 1 ? 3 : 2;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        emdf emdfVar4 = (emdf) fecpVar3;
        emdfVar4.f = i2 - 1;
        emdfVar4.b |= 8;
        if (i == 2) {
            int i3 = true == this.c ? 3 : 2;
            if (!fecpVar3.L()) {
                v.U();
            }
            emdf emdfVar5 = (emdf) v.b;
            emdfVar5.g = i3 - 1;
            emdfVar5.b |= 16;
        }
        CreateWalletObjectsEvent.b(this, this.r, (emdf) v.Q());
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        String string;
        String string2;
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        this.r = buyFlowConfig;
        arwm.s(buyFlowConfig);
        super.onCreate(bundle);
        ding.C(this, this.r, ding.a, false);
        setContentView(R.layout.wallet_activity_simple_dialog);
        if (this.i == null) {
            this.i = new dezg(this);
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
        arwm.s(this.r.b);
        arwm.s(this.r.b.b);
        if (bundle != null) {
            this.p = bundle.getInt("serviceConnectionSavePoint", -1);
            this.o = bundle.getBoolean("remoteOperationInProgress", false);
            this.b = bundle.getBoolean("immediateSaveFinished", false);
            this.h = (Account) bundle.getParcelable("account");
            if (bundle.containsKey("accountsThatHaveRequestedAuthTokens")) {
                this.s.addAll(bundle.getParcelableArrayList("accountsThatHaveRequestedAuthTokens"));
            }
        }
        this.n = (euln) efdk.b(getIntent(), "com.google.android.gms.wallet.CREATE_WALLET_OBJECTS_REQUEST", (feen) euln.a.iB(7, null));
        this.l = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        this.k = getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        this.m = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_OBJECT_DESCRIPTION");
        int intExtra = getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0);
        digu.a();
        this.c = intExtra == 1 && digu.c(this).length == 1;
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
        dfaq e = this.i.e();
        dfak dfakVar = new dfak() { // from class: disv
            @Override // defpackage.dfak
            public final void gn(Object obj) {
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
        Executor executor = dfax.a;
        dfaj dfajVar = new dfaj(dfbc.a(executor), dfakVar);
        dfaz dfazVar = (dfaz) e;
        dfas dfasVar = dfazVar.b;
        dfasVar.a(dfajVar);
        dfay.c(this).g(dfajVar);
        dfazVar.A();
        dfag dfagVar = new dfag(dfbc.a(executor), new dfah() { // from class: disw
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                RootChimeraActivity.this.e();
            }
        });
        dfasVar.a(dfagVar);
        dfay.c(this).g(dfagVar);
        dfazVar.A();
    }

    @Override // defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        super.onPause();
        t();
    }

    @Override // defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        efub efubVar = (efub) getSupportFragmentManager().findFragmentByTag("RootChimeraActivity.NETWORK_ERROR_DIALOG");
        this.j = efubVar;
        if (efubVar != null) {
            efubVar.a = this;
        }
        s();
    }

    @Override // defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
