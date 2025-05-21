package com.google.android.gms.nearby.sharing.settingsreview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.settingsreview.SettingsReviewFragment;
import defpackage.asmf;
import defpackage.clof;
import defpackage.crdx;
import defpackage.crea;
import defpackage.creo;
import defpackage.crfa;
import defpackage.crfd;
import defpackage.crgu;
import defpackage.crht;
import defpackage.cria;
import defpackage.dg;
import defpackage.fqmf;
import defpackage.fqmn;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrc;
import defpackage.jrh;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SettingsReviewFragment extends dg {
    private asmf a;
    private cria b;

    public SettingsReviewFragment() {
        super(R.layout.sharing_settingsreview_screen);
    }

    private final Intent x() {
        return ((Activity) requireContext()).getIntent();
    }

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        cria criaVar = (cria) new jrh(this, jrc.b(cria.a)).a(cria.class);
        this.b = criaVar;
        criaVar.h.g(this, new jpd() { // from class: crgv
            @Override // defpackage.jpd
            public final void a(Object obj) {
                SettingsReviewFragment settingsReviewFragment = SettingsReviewFragment.this;
                if (((crht) obj) == crht.DONE) {
                    try {
                        cexl.b(settingsReviewFragment.requireContext()).a("finishWithSlideDownAnimation", new Class[0]).a(new Object[0]);
                    } catch (cexm unused) {
                        ((qet) settingsReviewFragment.requireContext()).finish();
                    }
                }
            }
        });
    }

    @Override // defpackage.dg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new asmf(1, 9);
        cria criaVar = this.b;
        int intExtra = x().getIntExtra("settings_review_state", -1);
        criaVar.h.l(intExtra == 1 ? crht.PROMPT_TO_UPDATE : crht.DEFAULT);
        if (intExtra == 2) {
            jpc jpcVar = criaVar.g;
            clof a = DeviceVisibility.a.a();
            a.d = TimeUnit.SECONDS.toMillis(fqmf.C());
            jpcVar.l(a.a());
        }
        this.b.j = x().getStringExtra("source_activity");
        final crdx crdxVar = new crdx(this, this.a, this.b);
        getViewLifecycleOwnerLiveData().g(this, new jpd() { // from class: crdt
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ((jon) obj).getLifecycle().b(crdx.this);
            }
        });
        final crea creaVar = new crea(this, this.b.h);
        getViewLifecycleOwnerLiveData().g(this, new jpd() { // from class: crdy
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ((jon) obj).getLifecycle().b(crea.this);
            }
        });
        final crgu crguVar = new crgu(this, this.b);
        getViewLifecycleOwnerLiveData().g(this, new jpd() { // from class: crgp
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ((jon) obj).getLifecycle().b(crgu.this);
            }
        });
        final crfa crfaVar = new crfa(this, this.b);
        getViewLifecycleOwnerLiveData().g(this, new jpd() { // from class: crex
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ((jon) obj).getLifecycle().b(crfa.this);
            }
        });
        final crfd crfdVar = new crfd(this, this.b.i);
        getViewLifecycleOwnerLiveData().g(this, new jpd() { // from class: crfc
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ((jon) obj).getLifecycle().b(crfd.this);
            }
        });
        final creo creoVar = new creo(this, this.b.f);
        getViewLifecycleOwnerLiveData().g(this, new jpd() { // from class: cren
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ((jon) obj).getLifecycle().b(creo.this);
            }
        });
    }

    @Override // defpackage.dg
    public final void onDestroy() {
        super.onDestroy();
        this.a.shutdown();
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        if (x().getIntExtra("settings_review_state", -1) != 1) {
            if (fqmn.a.a().D()) {
                ((TextView) view.findViewById(R.id.title)).setText(R.string.sharing_settingsreview_default_title_new);
            } else {
                ((TextView) view.findViewById(R.id.title)).setText(R.string.sharing_settingsreview_default_title);
            }
            ((TextView) view.findViewById(R.id.subtitle)).setText(R.string.sharing_settingsreview_default_subtitle);
        }
    }
}
