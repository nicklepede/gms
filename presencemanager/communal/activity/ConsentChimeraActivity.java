package com.google.android.gms.presencemanager.communal.activity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.presencemanager.communal.activity.ConsentChimeraActivity;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asot;
import defpackage.cwso;
import defpackage.cwsq;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.entc;
import defpackage.etdt;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.qet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ConsentChimeraActivity extends qet implements View.OnClickListener {
    public cwsq j;
    private Account k;
    private String l;
    private String m;
    private String n;
    private ensv o;

    static {
        asot.b("ConsentChimeraActivity", asej.COMMUNAL);
    }

    public final void a(Status status, eiid eiidVar) {
        Intent intent = getIntent();
        arxd.l(status, intent, "status_key");
        if (eiidVar.h()) {
            intent.putExtra("credential_key", (String) eiidVar.c());
        }
        setResult(-1, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_accept) {
            if (view.getId() == R.id.button_reject) {
                a(new Status(16), eigb.a);
                return;
            }
            return;
        }
        fecj v = etdt.a.v();
        String str = this.l;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        str.getClass();
        ((etdt) fecpVar).b = str;
        if (!fecpVar.L()) {
            v.U();
        }
        ((etdt) v.b).e = "test-app";
        if (!v.b.L()) {
            v.U();
        }
        ((etdt) v.b).f = "test-structure";
        String str2 = this.m;
        if (!v.b.L()) {
            v.U();
        }
        etdt etdtVar = (etdt) v.b;
        str2.getClass();
        etdtVar.c = str2;
        final etdt etdtVar2 = (etdt) v.Q();
        ensj.t(this.o.submit(new Callable() { // from class: cwsn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ConsentChimeraActivity.this.j.a(etdtVar2);
            }
        }), new cwso(this), enre.a);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.consent);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.k = (Account) extras.getParcelable("communal_account_key");
            this.l = extras.getString("communal_obfuscated_gaia_id_key");
            this.m = extras.getString("communal_consent_id_key");
            this.n = extras.getString("communal_consent_key");
            ((TextView) findViewById(R.id.text_consent)).setText(this.n);
        }
        ((Button) findViewById(R.id.button_accept)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_reject)).setOnClickListener(this);
        Account account = this.k;
        eiig.x(account);
        this.j = new cwsq(this, account);
        this.o = entc.a(Executors.newCachedThreadPool());
    }
}
