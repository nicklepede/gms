package com.google.android.gms.wallet.ui.component.alert;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.LinkView;
import defpackage.efee;
import defpackage.efeh;
import defpackage.efei;
import defpackage.eflq;
import defpackage.efss;
import defpackage.efud;
import defpackage.efwo;
import defpackage.ehoy;
import defpackage.ehzo;
import defpackage.ehzr;
import defpackage.fasd;
import defpackage.fase;
import defpackage.fasi;
import defpackage.fask;
import defpackage.fasl;
import defpackage.feay;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AlertMessageView extends LinearLayout implements View.OnClickListener, efee {
    View a;
    ImageWithCaptionView b;
    InfoMessageView c;
    ViewGroup d;
    LinkView e;
    public Button f;
    public efss g;
    public efeh h;
    private ViewGroup i;
    private efud j;
    private fask k;

    public AlertMessageView(Context context) {
        super(context);
    }

    private final void c(fask faskVar, int i, LayoutInflater layoutInflater, eflq eflqVar) {
        LayoutInflater layoutInflater2;
        eflq eflqVar2;
        ColorStateList m = i == getContext().getResources().getColor(R.color.white) ? efwo.m(getContext()) : efwo.j(i);
        ImageWithCaptionView imageWithCaptionView = this.b;
        ehzo ehzoVar = faskVar.g;
        if (ehzoVar == null) {
            ehzoVar = ehzo.a;
        }
        imageWithCaptionView.m(ehzoVar);
        this.b.g = m;
        InfoMessageView infoMessageView = this.c;
        ehzr ehzrVar = faskVar.c;
        if (ehzrVar == null) {
            ehzrVar = ehzr.a;
        }
        infoMessageView.p(ehzrVar);
        this.c.setId(eflqVar.a());
        if ((faskVar.b & 16) != 0) {
            fase faseVar = faskVar.e;
            if (faseVar == null) {
                faseVar = fase.a;
            }
            int a = fasd.a(faseVar.g);
            if (a == 0 || a == 1) {
                fecj fecjVar = (fecj) faseVar.iB(5, null);
                fecjVar.X(faseVar);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                fase faseVar2 = (fase) fecjVar.b;
                faseVar2.g = 2;
                faseVar2.b |= 16;
                faseVar = (fase) fecjVar.Q();
            }
            layoutInflater2 = layoutInflater;
            eflqVar2 = eflqVar;
            LinkView c = LinkView.c(faseVar, getContext(), this.d, layoutInflater2, eflqVar2, this.j);
            this.e = c;
            c.setGravity(17);
            this.e.setTextColor(m);
            this.d.addView(this.e);
        } else {
            layoutInflater2 = layoutInflater;
            eflqVar2 = eflqVar;
        }
        if ((faskVar.b & 8) != 0) {
            Button button = (Button) layoutInflater2.inflate(com.google.android.gms.R.layout.wallet_view_secondary_button, this.d, false);
            this.f = button;
            fasl faslVar = faskVar.d;
            if (faslVar == null) {
                faslVar = fasl.a;
            }
            button.setText(faslVar.d);
            this.f.setId(eflqVar2.a());
            this.f.setTextColor(m);
            this.f.setOnClickListener(this);
            this.d.addView(this.f);
        }
        if ((faskVar.b & 32) != 0) {
            ehoy ehoyVar = faskVar.f;
            if (ehoyVar == null) {
                ehoyVar = ehoy.a;
            }
            this.g = (efss) layoutInflater2.inflate(com.google.android.gms.R.layout.wallet_view_standard_button_basic, this.d, false);
            if (((ehoyVar.b & 8) == 0 || ehoyVar.f.isEmpty()) && getContext().getString(com.google.android.gms.R.string.common_dismiss) != null) {
                fecj fecjVar2 = (fecj) ehoyVar.iB(5, null);
                fecjVar2.X(ehoyVar);
                String string = getContext().getString(com.google.android.gms.R.string.common_dismiss);
                if (!fecjVar2.b.L()) {
                    fecjVar2.U();
                }
                ehoy ehoyVar2 = (ehoy) fecjVar2.b;
                string.getClass();
                ehoyVar2.b |= 8;
                ehoyVar2.f = string;
                ehoyVar = (ehoy) fecjVar2.Q();
            }
            this.g.i(ehoyVar);
            this.g.setId(eflqVar2.a());
            this.g.d().setTextColor(m);
            this.g.c().setOnClickListener(this);
            efei.b(this.g.c(), ehoyVar.c, this.h);
            this.d.addView(this.g.c());
        }
        if (this.d.getChildCount() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            marginLayoutParams.bottomMargin = marginLayoutParams.topMargin;
            this.i.setLayoutParams(marginLayoutParams);
        }
    }

    public final void a(fask faskVar, eflq eflqVar, efud efudVar, boolean z) {
        this.k = faskVar;
        this.j = efudVar;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (!z) {
            this.a.setVisibility(0);
        }
        int a = fasi.a(faskVar.h);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 2 && i != 3) {
            c(faskVar, efwo.b(getContext(), com.google.android.gms.R.attr.colorAccent), from, eflqVar);
        } else {
            if (!z) {
                c(faskVar, efwo.b(getContext(), com.google.android.gms.R.attr.walletCardViewPageErrorColor), from, eflqVar);
                return;
            }
            int color = getResources().getColor(R.color.white);
            c(faskVar, color, from, eflqVar);
            this.c.v(color);
        }
    }

    @Override // defpackage.efee
    public final void ks() {
        efss efssVar = this.g;
        if (efssVar != null) {
            View c = efssVar.c();
            ehoy ehoyVar = this.k.f;
            if (ehoyVar == null) {
                ehoyVar = ehoy.a;
            }
            efei.c(c, ehoyVar.c, this.h);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f) {
            fasl faslVar = this.k.d;
            if (faslVar == null) {
                faslVar = fasl.a;
            }
            if (faslVar.b != 2 || ((feay) faslVar.c).d() <= 0) {
                if ((faslVar.b == 3 ? (String) faslVar.c : "").isEmpty()) {
                    return;
                }
                getContext().startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(faslVar.b == 3 ? (String) faslVar.c : "")));
            } else {
                Bundle bundle = new Bundle();
                bundle.putByteArray("EventListener.EXTRA_ALERT_ACTION_TOKEN", (faslVar.b == 2 ? (feay) faslVar.c : feay.b).M());
                this.j.x(22, bundle);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(com.google.android.gms.R.id.divider);
        this.i = (ViewGroup) findViewById(com.google.android.gms.R.id.content_container);
        this.b = (ImageWithCaptionView) findViewById(com.google.android.gms.R.id.icon);
        this.c = (InfoMessageView) findViewById(com.google.android.gms.R.id.description);
        this.d = (ViewGroup) findViewById(com.google.android.gms.R.id.button_container);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        efwo.N(this, z);
    }

    public AlertMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlertMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
