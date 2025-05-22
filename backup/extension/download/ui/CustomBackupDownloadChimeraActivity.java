package com.google.android.gms.backup.extension.download.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.ajwt;
import defpackage.akzc;
import defpackage.akzd;
import defpackage.akzr;
import defpackage.akzt;
import defpackage.akzv;
import defpackage.akzw;
import defpackage.akzy;
import defpackage.akzz;
import defpackage.alaa;
import defpackage.alac;
import defpackage.alah;
import defpackage.alak;
import defpackage.alao;
import defpackage.alap;
import defpackage.alaq;
import defpackage.alas;
import defpackage.alax;
import defpackage.aupz;
import defpackage.bp;
import defpackage.dg;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ekvl;
import defpackage.elgo;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.ind;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadChimeraActivity extends ryt implements alap, alaq, akzt, alah {
    public static final ajwt j = new ajwt("CustomDownloadProgressActivity");
    public akzd k;
    public alac l;
    public boolean m;
    public dg n;
    public akzr o;
    private final eqgo p = new aupz(1, 9);
    private alaa q;

    @Override // defpackage.akzt
    public final void a(int i) {
        j.d("onDontRestoreConfirmed from activity's listener", new Object[0]);
        alas alasVar = (alas) getSupportFragmentManager().h(alas.class.getName());
        if (alasVar != null) {
            alak alakVar = (alak) alasVar.b.getItem(i);
            alasVar.a.d("stopRestore for package %s ", alakVar.getClass().getName());
            alao alaoVar = alasVar.b;
            ajwt ajwtVar = alaoVar.b.a;
            String str = alakVar.a;
            ajwtVar.d("Updating view to cancelled for %s", str);
            alas.y(alakVar);
            alaoVar.notifyDataSetChanged();
            alasVar.b.a.b(str);
        }
    }

    @Override // defpackage.alap
    public final void b(String str) {
        alaa alaaVar = this.q;
        if (alaaVar != null) {
            alaa.a.d("Scheduling cancellation for package: %s", str);
            alaaVar.c.submit(new akzz(alaaVar, str));
        }
    }

    @Override // defpackage.alaq
    public final void c(akzc akzcVar) {
        if (this.o.b(this)) {
            return;
        }
        this.k.a(akzcVar);
    }

    @Override // defpackage.alah
    public final void f(elgo elgoVar) {
        j.d("User additionally selected packages: %s for download", elgoVar);
        this.l.f = elgoVar;
        alaa alaaVar = this.q;
        if (alaaVar != null) {
            alaa.a.d("Scheduling download for packages: %s", elgoVar);
            alaaVar.c.submit(new akzy(alaaVar, elgoVar));
        }
        if (!this.o.b(this)) {
            this.k.a(akzc.IN_PROGRESS);
        }
        this.n = new alas();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.G(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
        dg dgVar = this.n;
        bpVar.z(R.id.main_container, dgVar, dgVar.getClass().getName());
        bpVar.a();
    }

    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        int i2 = efwn.a;
        if (efrl.z(this) && efrl.v(this)) {
            j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            theme.applyStyle(R.style.BcStyleThemeOverlay, true);
        } else {
            j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            theme.applyStyle(R.style.HeavyThemeOverlay, true);
        }
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        j.j("onCreate", new Object[0]);
        efwo d = efwo.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        efwo efwoVar = new efwo(R.style.SudThemeGlifV3_DayNight, true);
        int i2 = efwn.a;
        setTheme(efwoVar.b(getIntent(), !efrl.v(this)));
        efwn.d();
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.q = new alaa(this, this.p);
        this.k = new akzd(this);
        this.l = alac.a();
        this.o = new akzr();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        j.j("onDestroy", new Object[0]);
        this.m = true;
        alaa alaaVar = this.q;
        if (alaaVar != null) {
            alaaVar.b();
            this.q = null;
        }
        alac.a = null;
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        j.j("onResume", new Object[0]);
        super.onResume();
        alax alaxVar = new alax(this.l);
        alaa alaaVar = this.q;
        ekvl.y(alaaVar);
        alaa.a.d("Scheduling connection to manager service", new Object[0]);
        eqgc.t(alaaVar.c.submit(new akzw(alaaVar, alaxVar)), new akzv(this), ind.g(this));
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        j.j("onStop", new Object[0]);
        if (this.n != null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.G(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
            bpVar.m(this.n);
            bpVar.e();
        }
        super.onStop();
    }
}
