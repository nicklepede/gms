package com.google.android.gms.credential.manager.promocards;

import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.promocards.PromoCardFragment;
import defpackage.aca;
import defpackage.acr;
import defpackage.axby;
import defpackage.axmk;
import defpackage.axrd;
import defpackage.aygr;
import defpackage.aygu;
import defpackage.aygv;
import defpackage.aygw;
import defpackage.aygx;
import defpackage.aygy;
import defpackage.aygz;
import defpackage.ayha;
import defpackage.ayhb;
import defpackage.ayhc;
import defpackage.ayhd;
import defpackage.ayhe;
import defpackage.ayho;
import defpackage.ayji;
import defpackage.cbip;
import defpackage.cbjt;
import defpackage.cbju;
import defpackage.cbkj;
import defpackage.cbkk;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PromoCardFragment extends aygr {
    public axby a;
    public Button ag;
    public AppCompatImageView ah;
    public aca ai;
    public cbip aj;
    public cbip ak;
    private final fxqu al;
    private View am;
    public axrd b;
    public TextView c;
    public Button d;

    public PromoCardFragment() {
        fxqu a = fxqv.a(fxqw.c, new ayhb(new ayha(this)));
        int i = fxya.a;
        this.al = new jxm(new fxxg(ayho.class), new ayhc(a), new ayhe(this, a), new ayhd(a));
    }

    public final ayho A() {
        return (ayho) this.al.a();
    }

    public final void B(ayji ayjiVar) {
        cbkk a = cbkj.a(cbju.a.v());
        fgrc v = cbjt.a.v();
        fxxm.f(v, "builder");
        fxxm.f(ayjiVar, "value");
        if (!v.b.L()) {
            v.U();
        }
        cbjt cbjtVar = (cbjt) v.b;
        cbjtVar.c = ayjiVar.f;
        cbjtVar.b |= 1;
        fgri Q = v.Q();
        fxxm.e(Q, "build(...)");
        cbjt cbjtVar2 = (cbjt) Q;
        fxxm.f(cbjtVar2, "value");
        fgrc fgrcVar = a.a;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        cbju cbjuVar = (cbju) fgrcVar.b;
        cbjtVar2.getClass();
        cbjuVar.e = cbjtVar2;
        cbjuVar.b |= 8;
        cbju a2 = a.a();
        axby z = z();
        View view = this.am;
        Button button = null;
        if (view == null) {
            fxxm.j("rootPromoCardView");
            view = null;
        }
        z.a(view, 201217, a2);
        axby z2 = z();
        Button button2 = this.d;
        if (button2 == null) {
            fxxm.j("primaryButton");
            button2 = null;
        }
        this.ak = z2.a(button2, 201674, a2);
        axby z3 = z();
        Button button3 = this.ag;
        if (button3 == null) {
            fxxm.j("secondaryButton");
        } else {
            button = button3;
        }
        this.aj = z3.a(button, 201675, a2);
    }

    public final void C(int i, int i2, int i3) {
        TextView textView = this.c;
        Button button = null;
        if (textView == null) {
            fxxm.j("descriptionTextView");
            textView = null;
        }
        textView.setText(i2);
        AppCompatImageView appCompatImageView = this.ah;
        if (appCompatImageView == null) {
            fxxm.j("iconImageView");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(i);
        Button button2 = this.d;
        if (button2 == null) {
            fxxm.j("primaryButton");
            button2 = null;
        }
        button2.setText(i3);
        Button button3 = this.ag;
        if (button3 == null) {
            fxxm.j("secondaryButton");
        } else {
            button = button3;
        }
        button.setText(R.string.common_dismiss);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fxxm.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pwm_promo_card, viewGroup, false);
        this.am = inflate;
        if (inflate == null) {
            fxxm.j("rootPromoCardView");
            inflate = null;
        }
        this.c = (TextView) inflate.findViewById(R.id.promo_card_text_body);
        this.ah = (AppCompatImageView) inflate.findViewById(R.id.promo_card_icon);
        Button button = (Button) inflate.findViewById(R.id.promo_card_primary_button);
        this.d = button;
        if (button == null) {
            fxxm.j("primaryButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: aygs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoCardFragment promoCardFragment = PromoCardFragment.this;
                ayho A = promoCardFragment.A();
                fycr.b(jxl.a(A), null, null, new ayhl(A, null), 3);
                cbip cbipVar = promoCardFragment.ak;
                if (cbipVar != null) {
                    cbipVar.a(epyr.TAP);
                }
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.promo_card_secondary_button);
        this.ag = button2;
        if (button2 == null) {
            fxxm.j("secondaryButton");
            button2 = null;
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: aygt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoCardFragment promoCardFragment = PromoCardFragment.this;
                ayho A = promoCardFragment.A();
                fycr.b(jxl.a(A), null, null, new ayhm(A, null), 3);
                cbip cbipVar = promoCardFragment.aj;
                if (cbipVar != null) {
                    cbipVar.a(epyr.TAP);
                }
            }
        });
        View view = this.am;
        if (view == null) {
            fxxm.j("rootPromoCardView");
            view = null;
        }
        axmk.a(A().e).g(getViewLifecycleOwner(), new aygu(new aygv(view)));
        A().g.g(getViewLifecycleOwner(), new aygu(new aygw(this)));
        this.ai = registerForActivityResult(new acr(), new aygx(this));
        A().h.g(getViewLifecycleOwner(), new aygu(new aygy(this)));
        A().j.g(getViewLifecycleOwner(), new aygu(new aygz(this)));
        View view2 = this.am;
        if (view2 != null) {
            return view2;
        }
        fxxm.j("rootPromoCardView");
        return null;
    }

    public final axby z() {
        axby axbyVar = this.a;
        if (axbyVar != null) {
            return axbyVar;
        }
        fxxm.j("visualElementViewBinder");
        return null;
    }
}
