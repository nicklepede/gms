package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.asbo;
import defpackage.asnd;
import defpackage.assa;
import defpackage.assb;
import defpackage.cary;
import defpackage.casw;
import defpackage.dfee;
import defpackage.fecj;
import defpackage.figx;
import defpackage.fiha;
import defpackage.fpwa;
import defpackage.ig;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ManageExistingSharesChimeraActivity extends qet implements AdapterView.OnItemSelectedListener {
    private assb j;
    private String k;
    private cary l;
    private int m;

    private static Intent a() {
        return new Intent().setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.screenId", 210).addFlags(268435456);
    }

    @Override // defpackage.qet
    public final boolean hu() {
        finish();
        return true;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.location_sharing_settings_activity_main);
        findViewById(R.id.progress_bar).setVisibility(8);
        ig hy = hy();
        hy.o(true);
        hy.s(false);
        asbo.f(this).m(78, dfee.LOCATION_SHARING_MODULEFOOD);
        if (bundle != null) {
            this.k = bundle.getString("account_name");
            this.m = bundle.getInt("update_progress_count");
        } else {
            this.k = getIntent().getStringExtra("account_name");
            this.m = 0;
        }
        if (this.k == null) {
            String[] w = asnd.w(asnd.h(this, getPackageName()));
            if (w.length <= 0) {
                if (fpwa.a.a().j()) {
                    startActivityForResult(a(), 102);
                    return;
                } else {
                    Toast.makeText(this, R.string.location_sharing_no_account_message, 1).show();
                    finish();
                    return;
                }
            }
            this.k = w[0];
        }
        fecj v = figx.a.v();
        if (!v.b.L()) {
            v.U();
        }
        figx figxVar = (figx) v.b;
        figxVar.c = 1;
        figxVar.b = 1 | figxVar.b;
        String stringExtra = getIntent().getStringExtra("calling_package_name");
        if (stringExtra != null) {
            if (!v.b.L()) {
                v.U();
            }
            figx figxVar2 = (figx) v.b;
            figxVar2.b |= 2;
            figxVar2.d = stringExtra;
        } else if (getIntent().getAction() == null) {
            if (!v.b.L()) {
                v.U();
            }
            figx figxVar3 = (figx) v.b;
            figxVar3.b |= 2;
            figxVar3.d = "com.google.android.gms";
        }
        this.l = new cary(this, (figx) v.Q(), bundle, null);
        assa assaVar = new assa(hy());
        assaVar.b(R.string.location_sharing_settings_title);
        assaVar.b = this;
        assaVar.c = this.k;
        this.j = assaVar.a();
        startActivityForResult(a().putExtra("extra.accountName", this.k), 102);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        casw.a(this);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        assb assbVar = this.j;
        if (assbVar == null || this.k == null) {
            return;
        }
        String item = assbVar.getItem(i);
        if (item.equals(this.k)) {
            return;
        }
        this.l.a((fiha) cary.d(13).Q());
        this.k = item;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.k);
        bundle.putInt("update_progress_count", this.m);
        cary caryVar = this.l;
        if (caryVar != null) {
            caryVar.b(bundle);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
