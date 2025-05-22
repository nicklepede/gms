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
import defpackage.aupz;
import defpackage.cnwn;
import defpackage.ctnb;
import defpackage.ctne;
import defpackage.ctns;
import defpackage.ctoe;
import defpackage.ctoh;
import defpackage.ctpy;
import defpackage.ctqx;
import defpackage.ctre;
import defpackage.dg;
import defpackage.ftga;
import defpackage.ftgi;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxr;
import defpackage.jxw;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SettingsReviewFragment extends dg {
    private aupz a;
    private ctre b;

    public SettingsReviewFragment() {
        super(R.layout.sharing_settingsreview_screen);
    }

    private final Intent x() {
        return ((Activity) requireContext()).getIntent();
    }

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        ctre ctreVar = (ctre) new jxw(this, jxr.b(ctre.a)).a(ctre.class);
        this.b = ctreVar;
        ctreVar.h.g(this, new jvs() { // from class: ctpz
            @Override // defpackage.jvs
            public final void a(Object obj) {
                SettingsReviewFragment settingsReviewFragment = SettingsReviewFragment.this;
                if (((ctqx) obj) == ctqx.DONE) {
                    try {
                        chew.b(settingsReviewFragment.requireContext()).a("finishWithSlideDownAnimation", new Class[0]).a(new Object[0]);
                    } catch (chex unused) {
                        ((rxx) settingsReviewFragment.requireContext()).finish();
                    }
                }
            }
        });
    }

    @Override // defpackage.dg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new aupz(1, 9);
        ctre ctreVar = this.b;
        int intExtra = x().getIntExtra("settings_review_state", -1);
        ctreVar.h.l(intExtra == 1 ? ctqx.PROMPT_TO_UPDATE : ctqx.DEFAULT);
        if (intExtra == 2) {
            jvr jvrVar = ctreVar.g;
            cnwn a = DeviceVisibility.a.a();
            a.d = TimeUnit.SECONDS.toMillis(ftga.C());
            jvrVar.l(a.a());
        }
        this.b.j = x().getStringExtra("source_activity");
        final ctnb ctnbVar = new ctnb(this, this.a, this.b);
        getViewLifecycleOwnerLiveData().g(this, new jvs() { // from class: ctmx
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ((jvc) obj).getLifecycle().b(ctnb.this);
            }
        });
        final ctne ctneVar = new ctne(this, this.b.h);
        getViewLifecycleOwnerLiveData().g(this, new jvs() { // from class: ctnc
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ((jvc) obj).getLifecycle().b(ctne.this);
            }
        });
        final ctpy ctpyVar = new ctpy(this, this.b);
        getViewLifecycleOwnerLiveData().g(this, new jvs() { // from class: ctpt
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ((jvc) obj).getLifecycle().b(ctpy.this);
            }
        });
        final ctoe ctoeVar = new ctoe(this, this.b);
        getViewLifecycleOwnerLiveData().g(this, new jvs() { // from class: ctob
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ((jvc) obj).getLifecycle().b(ctoe.this);
            }
        });
        final ctoh ctohVar = new ctoh(this, this.b.i);
        getViewLifecycleOwnerLiveData().g(this, new jvs() { // from class: ctog
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ((jvc) obj).getLifecycle().b(ctoh.this);
            }
        });
        final ctns ctnsVar = new ctns(this, this.b.f);
        getViewLifecycleOwnerLiveData().g(this, new jvs() { // from class: ctnr
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ((jvc) obj).getLifecycle().b(ctns.this);
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
            if (ftgi.a.lK().E()) {
                ((TextView) view.findViewById(R.id.title)).setText(R.string.sharing_settingsreview_default_title_new);
            } else {
                ((TextView) view.findViewById(R.id.title)).setText(R.string.sharing_settingsreview_default_title);
            }
            ((TextView) view.findViewById(R.id.subtitle)).setText(R.string.sharing_settingsreview_default_subtitle);
        }
    }
}
