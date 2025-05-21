package com.google.android.gms.backup.extension.download.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.ahwd;
import defpackage.aiym;
import defpackage.aiyn;
import defpackage.aizb;
import defpackage.aizd;
import defpackage.aizf;
import defpackage.aizg;
import defpackage.aizi;
import defpackage.aizj;
import defpackage.aizk;
import defpackage.aizm;
import defpackage.aizr;
import defpackage.aizu;
import defpackage.aizy;
import defpackage.aizz;
import defpackage.ajaa;
import defpackage.ajac;
import defpackage.ajah;
import defpackage.asmf;
import defpackage.bp;
import defpackage.dg;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.eiig;
import defpackage.eitj;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.iln;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadChimeraActivity extends qfp implements aizz, ajaa, aizd, aizr {
    public static final ahwd j = new ahwd("CustomDownloadProgressActivity");
    public aiyn k;
    public aizm l;
    public boolean m;
    public dg n;
    public aizb o;
    private final ensv p = new asmf(1, 9);
    private aizk q;

    @Override // defpackage.aizd
    public final void a(int i) {
        j.d("onDontRestoreConfirmed from activity's listener", new Object[0]);
        ajac ajacVar = (ajac) getSupportFragmentManager().h(ajac.class.getName());
        if (ajacVar != null) {
            aizu aizuVar = (aizu) ajacVar.b.getItem(i);
            ajacVar.a.d("stopRestore for package %s ", aizuVar.getClass().getName());
            aizy aizyVar = ajacVar.b;
            ahwd ahwdVar = aizyVar.b.a;
            String str = aizuVar.a;
            ahwdVar.d("Updating view to cancelled for %s", str);
            ajac.y(aizuVar);
            aizyVar.notifyDataSetChanged();
            ajacVar.b.a.b(str);
        }
    }

    @Override // defpackage.aizz
    public final void b(String str) {
        aizk aizkVar = this.q;
        if (aizkVar != null) {
            aizk.a.d("Scheduling cancellation for package: %s", str);
            aizkVar.c.submit(new aizj(aizkVar, str));
        }
    }

    @Override // defpackage.ajaa
    public final void c(aiym aiymVar) {
        if (this.o.b(this)) {
            return;
        }
        this.k.a(aiymVar);
    }

    @Override // defpackage.aizr
    public final void f(eitj eitjVar) {
        j.d("User additionally selected packages: %s for download", eitjVar);
        this.l.f = eitjVar;
        aizk aizkVar = this.q;
        if (aizkVar != null) {
            aizk.a.d("Scheduling download for packages: %s", eitjVar);
            aizkVar.c.submit(new aizi(aizkVar, eitjVar));
        }
        if (!this.o.b(this)) {
            this.k.a(aiym.IN_PROGRESS);
        }
        this.n = new ajac();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.G(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
        dg dgVar = this.n;
        bpVar.z(R.id.main_container, dgVar, dgVar.getClass().getName());
        bpVar.a();
    }

    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        int i2 = edjs.a;
        if (edeq.z(this) && edeq.v(this)) {
            j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            theme.applyStyle(R.style.BcStyleThemeOverlay, true);
        } else {
            j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            theme.applyStyle(R.style.HeavyThemeOverlay, true);
        }
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        j.j("onCreate", new Object[0]);
        edjt d = edjt.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        edjt edjtVar = new edjt(R.style.SudThemeGlifV3_DayNight, true);
        int i2 = edjs.a;
        setTheme(edjtVar.b(getIntent(), !edeq.v(this)));
        edjs.d();
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.q = new aizk(this, this.p);
        this.k = new aiyn(this);
        this.l = aizm.a();
        this.o = new aizb();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        j.j("onDestroy", new Object[0]);
        this.m = true;
        aizk aizkVar = this.q;
        if (aizkVar != null) {
            aizkVar.b();
            this.q = null;
        }
        aizm.a = null;
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        j.j("onResume", new Object[0]);
        super.onResume();
        ajah ajahVar = new ajah(this.l);
        aizk aizkVar = this.q;
        eiig.x(aizkVar);
        aizk.a.d("Scheduling connection to manager service", new Object[0]);
        ensj.t(aizkVar.c.submit(new aizg(aizkVar, ajahVar)), new aizf(this), iln.g(this));
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        j.j("onStop", new Object[0]);
        if (this.n != null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.G(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
            bpVar.n(this.n);
            bpVar.e();
        }
        super.onStop();
    }
}
