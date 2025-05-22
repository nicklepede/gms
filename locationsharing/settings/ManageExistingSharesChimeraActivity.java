package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.google.android.gms.R;
import defpackage.aued;
import defpackage.auqx;
import defpackage.auvu;
import defpackage.auvv;
import defpackage.cdao;
import defpackage.cdbm;
import defpackage.dhpk;
import defpackage.fgrc;
import defpackage.fkwu;
import defpackage.fkwx;
import defpackage.fspt;
import defpackage.ig;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ManageExistingSharesChimeraActivity extends rxx implements AdapterView.OnItemSelectedListener {
    private auvv j;
    private String k;
    private cdao l;
    private int m;

    private static Intent a() {
        return new Intent().setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.screenId", 210).addFlags(268435456);
    }

    @Override // defpackage.rxx
    public final boolean hK() {
        finish();
        return true;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.location_sharing_settings_activity_main);
        findViewById(R.id.progress_bar).setVisibility(8);
        ig hO = hO();
        hO.o(true);
        hO.s(false);
        aued.f(this).m(78, dhpk.LOCATION_SHARING_MODULEFOOD);
        if (bundle != null) {
            this.k = bundle.getString("account_name");
            this.m = bundle.getInt("update_progress_count");
        } else {
            this.k = getIntent().getStringExtra("account_name");
            this.m = 0;
        }
        if (this.k == null) {
            String[] w = auqx.w(auqx.h(this, getPackageName()));
            if (w.length <= 0) {
                if (fspt.a.lK().j()) {
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
        fgrc v = fkwu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fkwu fkwuVar = (fkwu) v.b;
        fkwuVar.c = 1;
        fkwuVar.b = 1 | fkwuVar.b;
        String stringExtra = getIntent().getStringExtra("calling_package_name");
        if (stringExtra != null) {
            if (!v.b.L()) {
                v.U();
            }
            fkwu fkwuVar2 = (fkwu) v.b;
            fkwuVar2.b |= 2;
            fkwuVar2.d = stringExtra;
        } else if (getIntent().getAction() == null) {
            if (!v.b.L()) {
                v.U();
            }
            fkwu fkwuVar3 = (fkwu) v.b;
            fkwuVar3.b |= 2;
            fkwuVar3.d = "com.google.android.gms";
        }
        this.l = new cdao(this, (fkwu) v.Q(), bundle, null);
        auvu auvuVar = new auvu(hO());
        auvuVar.b(R.string.location_sharing_settings_title);
        auvuVar.b = this;
        auvuVar.c = this.k;
        this.j = auvuVar.a();
        startActivityForResult(a().putExtra("extra.accountName", this.k), 102);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        cdbm.a(this);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        auvv auvvVar = this.j;
        if (auvvVar == null || this.k == null) {
            return;
        }
        String item = auvvVar.getItem(i);
        if (item.equals(this.k)) {
            return;
        }
        this.l.a((fkwx) cdao.d(13).Q());
        this.k = item;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.k);
        bundle.putInt("update_progress_count", this.m);
        cdao cdaoVar = this.l;
        if (cdaoVar != null) {
            cdaoVar.b(bundle);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
