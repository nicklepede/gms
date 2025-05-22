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
import defpackage.atzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.czcl;
import defpackage.czcn;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.eqgv;
import defpackage.evtl;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.rxx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ConsentChimeraActivity extends rxx implements View.OnClickListener {
    public czcn j;
    private Account k;
    private String l;
    private String m;
    private String n;
    private eqgo o;

    static {
        ausn.b("ConsentChimeraActivity", auid.COMMUNAL);
    }

    public final void a(Status status, ekvi ekviVar) {
        Intent intent = getIntent();
        atzs.l(status, intent, "status_key");
        if (ekviVar.h()) {
            intent.putExtra("credential_key", (String) ekviVar.c());
        }
        setResult(-1, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_accept) {
            if (view.getId() == R.id.button_reject) {
                a(new Status(16), ektg.a);
                return;
            }
            return;
        }
        fgrc v = evtl.a.v();
        String str = this.l;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        str.getClass();
        ((evtl) fgriVar).b = str;
        if (!fgriVar.L()) {
            v.U();
        }
        ((evtl) v.b).e = "test-app";
        if (!v.b.L()) {
            v.U();
        }
        ((evtl) v.b).f = "test-structure";
        String str2 = this.m;
        if (!v.b.L()) {
            v.U();
        }
        evtl evtlVar = (evtl) v.b;
        str2.getClass();
        evtlVar.c = str2;
        final evtl evtlVar2 = (evtl) v.Q();
        eqgc.t(this.o.submit(new Callable() { // from class: czck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ConsentChimeraActivity.this.j.a(evtlVar2);
            }
        }), new czcl(this), eqex.a);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
        ekvl.y(account);
        this.j = new czcn(this, account);
        this.o = eqgv.a(Executors.newCachedThreadPool());
    }
}
