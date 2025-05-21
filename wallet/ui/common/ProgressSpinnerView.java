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
import defpackage.byhr;
import defpackage.dilb;
import defpackage.dilc;
import defpackage.ding;
import defpackage.dinh;
import defpackage.djez;
import defpackage.djfc;
import defpackage.efwo;
import defpackage.ehzo;
import defpackage.ehzr;
import defpackage.eiae;
import defpackage.eiao;
import defpackage.eiap;
import defpackage.lbf;
import defpackage.lbl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ProgressSpinnerView extends LinearLayout implements dinh, dilb {
    View a;
    View b;
    public ImageView c;
    InfoMessageView d;
    TextView e;
    public eiae f;
    public final Handler g;
    public lbl h;
    boolean i;
    eiap j;
    private int k;
    private String l;

    public ProgressSpinnerView(Context context) {
        super(context);
        this.g = new byhr();
    }

    private final void b() {
        if (this.k < this.j.b.size()) {
            eiao eiaoVar = (eiao) this.j.b.get(this.k);
            InfoMessageView infoMessageView = this.d;
            ehzr ehzrVar = eiaoVar.b;
            if (ehzrVar == null) {
                ehzrVar = ehzr.a;
            }
            infoMessageView.s(ehzrVar);
            efwo.O(this.d, true);
            if (eiaoVar.c > 0) {
                this.g.postDelayed(dilc.a(this, "handleTextAppearingAnimationEnd"), eiaoVar.c);
            }
        }
    }

    private final void c() {
        this.g.removeCallbacksAndMessages(null);
        this.a.setVisibility(0);
        this.b.setVisibility(8);
        lbl lblVar = this.h;
        if (lblVar != null) {
            lblVar.a();
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

    private final void e(ehzo ehzoVar, lbf lbfVar) {
        if (ehzoVar == null || ehzoVar.equals(ehzo.a)) {
            return;
        }
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        this.c.setContentDescription(ehzoVar.k);
        lbl c = lbl.c(getContext(), efwo.ah(getContext(), ehzoVar.d));
        this.h = c;
        this.c.setImageDrawable(c);
        ImageWithCaptionView.n(getContext(), this.c, ehzoVar, false);
        this.h.b(lbfVar);
    }

    @Override // defpackage.dinh
    public final void C(Bundle bundle) {
        bundle.putBoolean("shouldShowProgressSpinner", P());
        bundle.putBoolean("completedAnimationRunning", this.i);
        c();
    }

    @Override // defpackage.dinh
    public final void G(eiae eiaeVar, boolean z) {
        this.f = eiaeVar;
        c();
        if (eiaeVar == null || !efwo.S(getContext())) {
            return;
        }
        int i = eiaeVar.b;
        if ((i & 4) != 0 && z) {
            ehzo ehzoVar = eiaeVar.e;
            if (ehzoVar == null) {
                ehzoVar = ehzo.a;
            }
            e(ehzoVar, new djez(this));
            this.i = true;
            this.h.start();
        } else if ((i & 1) != 0) {
            ehzo ehzoVar2 = eiaeVar.c;
            if (ehzoVar2 == null) {
                ehzoVar2 = ehzo.a;
            }
            e(ehzoVar2, new djfc(this));
        }
        eiap eiapVar = eiaeVar.d;
        if (eiapVar == null) {
            eiapVar = eiap.a;
        }
        if (eiapVar.b.size() > 0) {
            eiap eiapVar2 = eiaeVar.d;
            if (eiapVar2 == null) {
                eiapVar2 = eiap.a;
            }
            this.j = eiapVar2;
        }
    }

    @Override // defpackage.dinh
    public final void I(String str) {
        this.l = str;
        efwo.E(this.e, str);
    }

    @Override // defpackage.dinh
    public final void L(boolean z) {
        int i = true != z ? 8 : 0;
        if (getVisibility() != i && !this.i) {
            ding.w(this, z, this.l);
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

    @Override // defpackage.dinh
    public final boolean P() {
        return getVisibility() == 0;
    }

    public final void a() {
        this.i = false;
        c();
        L(false);
        eiae eiaeVar = this.f;
        if (eiaeVar != null) {
            ehzo ehzoVar = eiaeVar.c;
            if (ehzoVar == null) {
                ehzoVar = ehzo.a;
            }
            e(ehzoVar, new djfc(this));
        }
    }

    @Override // defpackage.dilb
    public final void aq(Bundle bundle) {
        if ("handleTextAppearingAnimationEnd".equals(dilc.b(bundle))) {
            efwo.x(this.d, 0, 0, 4, dilc.a(this, "handleTextDisappearingAnimationEnd"));
        } else if ("handleTextDisappearingAnimationEnd".equals(dilc.b(bundle))) {
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
        if (efwo.Y(getContext())) {
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

    @Override // defpackage.dinh
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
        this.g = new byhr();
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new byhr();
    }
}
