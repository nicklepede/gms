package com.google.android.gms.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.caqj;
import defpackage.dkwm;
import defpackage.dkwn;
import defpackage.dkyr;
import defpackage.dkys;
import defpackage.dlqs;
import defpackage.dlqv;
import defpackage.eijr;
import defpackage.ekmu;
import defpackage.ekmx;
import defpackage.eknk;
import defpackage.eknu;
import defpackage.eknv;
import defpackage.mua;
import defpackage.mug;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ProgressSpinnerView extends LinearLayout implements dkys, dkwm {
    View a;
    View b;
    public ImageView c;
    InfoMessageView d;
    TextView e;
    public eknk f;
    public final Handler g;
    public mug h;
    boolean i;
    eknv j;
    private int k;
    private String l;

    public ProgressSpinnerView(Context context) {
        super(context);
        this.g = new caqj();
    }

    private final void b() {
        if (this.k < this.j.b.size()) {
            eknu eknuVar = (eknu) this.j.b.get(this.k);
            InfoMessageView infoMessageView = this.d;
            ekmx ekmxVar = eknuVar.b;
            if (ekmxVar == null) {
                ekmxVar = ekmx.a;
            }
            infoMessageView.s(ekmxVar);
            eijr.O(this.d, true);
            if (eknuVar.c > 0) {
                this.g.postDelayed(dkwn.a(this, "handleTextAppearingAnimationEnd"), eknuVar.c);
            }
        }
    }

    private final void c() {
        this.g.removeCallbacksAndMessages(null);
        this.a.setVisibility(0);
        this.b.setVisibility(8);
        mug mugVar = this.h;
        if (mugVar != null) {
            mugVar.a();
            if (this.h.isRunning()) {
                this.h.stop();
            }
            this.h = null;
        }
        d();
        this.j = null;
    }

    private final void d() {
        this.d.clearAnimation();
        if (this.d.animate() != null) {
            this.d.animate().setListener(null);
        }
        this.d.setVisibility(4);
    }

    private final void e(ekmu ekmuVar, mua muaVar) {
        if (ekmuVar == null || ekmuVar.equals(ekmu.a)) {
            return;
        }
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        this.c.setContentDescription(ekmuVar.k);
        mug c = mug.c(getContext(), eijr.ah(getContext(), ekmuVar.d));
        this.h = c;
        this.c.setImageDrawable(c);
        ImageWithCaptionView.n(getContext(), this.c, ekmuVar, false);
        this.h.b(muaVar);
    }

    @Override // defpackage.dkys
    public final void C(Bundle bundle) {
        bundle.putBoolean("shouldShowProgressSpinner", P());
        bundle.putBoolean("completedAnimationRunning", this.i);
        c();
    }

    @Override // defpackage.dkys
    public final void G(eknk eknkVar, boolean z) {
        this.f = eknkVar;
        c();
        if (eknkVar == null || !eijr.S(getContext())) {
            return;
        }
        int i = eknkVar.b;
        if ((i & 4) != 0 && z) {
            ekmu ekmuVar = eknkVar.e;
            if (ekmuVar == null) {
                ekmuVar = ekmu.a;
            }
            e(ekmuVar, new dlqs(this));
            this.i = true;
            this.h.start();
        } else if ((i & 1) != 0) {
            ekmu ekmuVar2 = eknkVar.c;
            if (ekmuVar2 == null) {
                ekmuVar2 = ekmu.a;
            }
            e(ekmuVar2, new dlqv(this));
        }
        eknv eknvVar = eknkVar.d;
        if (eknvVar == null) {
            eknvVar = eknv.a;
        }
        if (eknvVar.b.size() > 0) {
            eknv eknvVar2 = eknkVar.d;
            if (eknvVar2 == null) {
                eknvVar2 = eknv.a;
            }
            this.j = eknvVar2;
        }
    }

    @Override // defpackage.dkys
    public final void I(String str) {
        this.l = str;
        eijr.E(this.e, str);
    }

    @Override // defpackage.dkys
    public final void L(boolean z) {
        int i = true != z ? 8 : 0;
        if (getVisibility() != i && !this.i) {
            dkyr.w(this, z, this.l);
            setVisibility(i);
        }
        if (this.h != null) {
            if (P() && !this.h.isRunning()) {
                this.h.start();
            } else if (!P() && this.h.isRunning()) {
                this.h.a();
                this.h.stop();
            }
        }
        if (this.j != null) {
            if (!z) {
                d();
            } else {
                this.k = 0;
                b();
            }
        }
    }

    @Override // defpackage.dkys
    public final boolean P() {
        return getVisibility() == 0;
    }

    public final void a() {
        this.i = false;
        c();
        L(false);
        eknk eknkVar = this.f;
        if (eknkVar != null) {
            ekmu ekmuVar = eknkVar.c;
            if (ekmuVar == null) {
                ekmuVar = ekmu.a;
            }
            e(ekmuVar, new dlqv(this));
        }
    }

    @Override // defpackage.dkwm
    public final void aq(Bundle bundle) {
        if ("handleTextAppearingAnimationEnd".equals(dkwn.b(bundle))) {
            eijr.x(this.d, 0, 0, 4, dkwn.a(this, "handleTextDisappearingAnimationEnd"));
        } else if ("handleTextDisappearingAnimationEnd".equals(dkwn.b(bundle))) {
            this.k++;
            b();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        this.a = findViewById(R.id.default_spinner);
        this.b = findViewById(R.id.animation_spinner);
        this.c = (ImageView) findViewById(R.id.animation_spinner_image);
        this.d = (InfoMessageView) findViewById(R.id.progress_text_animation);
        this.e = (TextView) findViewById(R.id.progress_spinner_caption);
        if (eijr.Y(getContext())) {
            this.a.setVisibility(8);
            this.a = ((ViewStub) findViewById(R.id.visdre_spinner)).inflate();
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorBackground});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                setBackgroundColor(getResources().getColor(resourceId));
            }
        }
    }

    @Override // defpackage.dkys
    public final void s(Bundle bundle) {
        L(bundle.getBoolean("shouldShowProgressSpinner", false));
        boolean z = bundle.getBoolean("completedAnimationRunning");
        this.i = z;
        if (z) {
            a();
        }
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new caqj();
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new caqj();
    }
}
