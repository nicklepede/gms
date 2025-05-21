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
import defpackage.abv;
import defpackage.acm;
import defpackage.auxz;
import defpackage.avil;
import defpackage.avnd;
import defpackage.awcr;
import defpackage.awcu;
import defpackage.awcv;
import defpackage.awcw;
import defpackage.awcx;
import defpackage.awcy;
import defpackage.awcz;
import defpackage.awda;
import defpackage.awdb;
import defpackage.awdc;
import defpackage.awdd;
import defpackage.awde;
import defpackage.awdo;
import defpackage.awfi;
import defpackage.byzy;
import defpackage.bzbc;
import defpackage.bzbd;
import defpackage.bzbs;
import defpackage.bzbt;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PromoCardFragment extends awcr {
    public auxz a;
    public Button ag;
    public AppCompatImageView ah;
    public abv ai;
    public byzy aj;
    public byzy ak;
    private final fuuw al;
    private View am;
    public avnd b;
    public TextView c;
    public Button d;

    public PromoCardFragment() {
        fuuw a = fuux.a(fuuy.c, new awdb(new awda(this)));
        int i = fvcc.a;
        this.al = new jqx(new fvbi(awdo.class), new awdc(a), new awde(this, a), new awdd(a));
    }

    public final awdo A() {
        return (awdo) this.al.a();
    }

    public final void B(awfi awfiVar) {
        bzbt a = bzbs.a(bzbd.a.v());
        fecj v = bzbc.a.v();
        fvbo.f(v, "builder");
        fvbo.f(awfiVar, "value");
        if (!v.b.L()) {
            v.U();
        }
        bzbc bzbcVar = (bzbc) v.b;
        bzbcVar.c = awfiVar.f;
        bzbcVar.b |= 1;
        fecp Q = v.Q();
        fvbo.e(Q, "build(...)");
        bzbc bzbcVar2 = (bzbc) Q;
        fvbo.f(bzbcVar2, "value");
        fecj fecjVar = a.a;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        bzbd bzbdVar = (bzbd) fecjVar.b;
        bzbcVar2.getClass();
        bzbdVar.e = bzbcVar2;
        bzbdVar.b |= 8;
        bzbd a2 = a.a();
        auxz z = z();
        View view = this.am;
        Button button = null;
        if (view == null) {
            fvbo.j("rootPromoCardView");
            view = null;
        }
        z.a(view, 201217, a2);
        auxz z2 = z();
        Button button2 = this.d;
        if (button2 == null) {
            fvbo.j("primaryButton");
            button2 = null;
        }
        this.ak = z2.a(button2, 201674, a2);
        auxz z3 = z();
        Button button3 = this.ag;
        if (button3 == null) {
            fvbo.j("secondaryButton");
        } else {
            button = button3;
        }
        this.aj = z3.a(button, 201675, a2);
    }

    public final void C(int i, int i2, int i3) {
        TextView textView = this.c;
        Button button = null;
        if (textView == null) {
            fvbo.j("descriptionTextView");
            textView = null;
        }
        textView.setText(i2);
        AppCompatImageView appCompatImageView = this.ah;
        if (appCompatImageView == null) {
            fvbo.j("iconImageView");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(i);
        Button button2 = this.d;
        if (button2 == null) {
            fvbo.j("primaryButton");
            button2 = null;
        }
        button2.setText(i3);
        Button button3 = this.ag;
        if (button3 == null) {
            fvbo.j("secondaryButton");
        } else {
            button = button3;
        }
        button.setText(R.string.common_dismiss);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fvbo.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pwm_promo_card, viewGroup, false);
        this.am = inflate;
        if (inflate == null) {
            fvbo.j("rootPromoCardView");
            inflate = null;
        }
        this.c = (TextView) inflate.findViewById(R.id.promo_card_text_body);
        this.ah = (AppCompatImageView) inflate.findViewById(R.id.promo_card_icon);
        Button button = (Button) inflate.findViewById(R.id.promo_card_primary_button);
        this.d = button;
        if (button == null) {
            fvbo.j("primaryButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: awcs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoCardFragment promoCardFragment = PromoCardFragment.this;
                awdo A = promoCardFragment.A();
                fvgt.b(jqw.a(A), null, null, new awdl(A, null), 3);
                byzy byzyVar = promoCardFragment.ak;
                if (byzyVar != null) {
                    byzyVar.a(enla.TAP);
                }
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.promo_card_secondary_button);
        this.ag = button2;
        if (button2 == null) {
            fvbo.j("secondaryButton");
            button2 = null;
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: awct
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoCardFragment promoCardFragment = PromoCardFragment.this;
                awdo A = promoCardFragment.A();
                fvgt.b(jqw.a(A), null, null, new awdm(A, null), 3);
                byzy byzyVar = promoCardFragment.aj;
                if (byzyVar != null) {
                    byzyVar.a(enla.TAP);
                }
            }
        });
        View view = this.am;
        if (view == null) {
            fvbo.j("rootPromoCardView");
            view = null;
        }
        avil.a(A().e).g(getViewLifecycleOwner(), new awcu(new awcv(view)));
        A().g.g(getViewLifecycleOwner(), new awcu(new awcw(this)));
        this.ai = registerForActivityResult(new acm(), new awcx(this));
        A().h.g(getViewLifecycleOwner(), new awcu(new awcy(this)));
        A().j.g(getViewLifecycleOwner(), new awcu(new awcz(this)));
        View view2 = this.am;
        if (view2 != null) {
            return view2;
        }
        fvbo.j("rootPromoCardView");
        return null;
    }

    public final auxz z() {
        auxz auxzVar = this.a;
        if (auxzVar != null) {
            return auxzVar;
        }
        fvbo.j("visualElementViewBinder");
        return null;
    }
}
