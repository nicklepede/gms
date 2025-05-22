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
import defpackage.ehrh;
import defpackage.ehrk;
import defpackage.ehrl;
import defpackage.ehyt;
import defpackage.eifv;
import defpackage.eihg;
import defpackage.eijr;
import defpackage.ekce;
import defpackage.ekmu;
import defpackage.ekmx;
import defpackage.fdgs;
import defpackage.fdgt;
import defpackage.fdgx;
import defpackage.fdgz;
import defpackage.fdha;
import defpackage.fgpr;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AlertMessageView extends LinearLayout implements View.OnClickListener, ehrh {
    View a;
    ImageWithCaptionView b;
    InfoMessageView c;
    ViewGroup d;
    LinkView e;
    public Button f;
    public eifv g;
    public ehrk h;
    private ViewGroup i;
    private eihg j;
    private fdgz k;

    public AlertMessageView(Context context) {
        super(context);
    }

    private final void c(fdgz fdgzVar, int i, LayoutInflater layoutInflater, ehyt ehytVar) {
        LayoutInflater layoutInflater2;
        ehyt ehytVar2;
        ColorStateList m = i == getContext().getResources().getColor(R.color.white) ? eijr.m(getContext()) : eijr.j(i);
        ImageWithCaptionView imageWithCaptionView = this.b;
        ekmu ekmuVar = fdgzVar.g;
        if (ekmuVar == null) {
            ekmuVar = ekmu.a;
        }
        imageWithCaptionView.m(ekmuVar);
        this.b.g = m;
        InfoMessageView infoMessageView = this.c;
        ekmx ekmxVar = fdgzVar.c;
        if (ekmxVar == null) {
            ekmxVar = ekmx.a;
        }
        infoMessageView.p(ekmxVar);
        this.c.setId(ehytVar.a());
        if ((fdgzVar.b & 16) != 0) {
            fdgt fdgtVar = fdgzVar.e;
            if (fdgtVar == null) {
                fdgtVar = fdgt.a;
            }
            int a = fdgs.a(fdgtVar.g);
            if (a == 0 || a == 1) {
                fgrc fgrcVar = (fgrc) fdgtVar.iQ(5, null);
                fgrcVar.X(fdgtVar);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                fdgt fdgtVar2 = (fdgt) fgrcVar.b;
                fdgtVar2.g = 2;
                fdgtVar2.b |= 16;
                fdgtVar = (fdgt) fgrcVar.Q();
            }
            layoutInflater2 = layoutInflater;
            ehytVar2 = ehytVar;
            LinkView e = LinkView.e(fdgtVar, getContext(), this.d, layoutInflater2, ehytVar2, this.j);
            this.e = e;
            e.setGravity(17);
            this.e.setTextColor(m);
            this.d.addView(this.e);
        } else {
            layoutInflater2 = layoutInflater;
            ehytVar2 = ehytVar;
        }
        if ((fdgzVar.b & 8) != 0) {
            Button button = (Button) layoutInflater2.inflate(com.google.android.gms.R.layout.wallet_view_secondary_button, this.d, false);
            this.f = button;
            fdha fdhaVar = fdgzVar.d;
            if (fdhaVar == null) {
                fdhaVar = fdha.a;
            }
            button.setText(fdhaVar.d);
            this.f.setId(ehytVar2.a());
            this.f.setTextColor(m);
            this.f.setOnClickListener(this);
            this.d.addView(this.f);
        }
        if ((fdgzVar.b & 32) != 0) {
            ekce ekceVar = fdgzVar.f;
            if (ekceVar == null) {
                ekceVar = ekce.a;
            }
            this.g = (eifv) layoutInflater2.inflate(com.google.android.gms.R.layout.wallet_view_standard_button_basic, this.d, false);
            if (((ekceVar.b & 8) == 0 || ekceVar.f.isEmpty()) && getContext().getString(com.google.android.gms.R.string.common_dismiss) != null) {
                fgrc fgrcVar2 = (fgrc) ekceVar.iQ(5, null);
                fgrcVar2.X(ekceVar);
                String string = getContext().getString(com.google.android.gms.R.string.common_dismiss);
                if (!fgrcVar2.b.L()) {
                    fgrcVar2.U();
                }
                ekce ekceVar2 = (ekce) fgrcVar2.b;
                string.getClass();
                ekceVar2.b |= 8;
                ekceVar2.f = string;
                ekceVar = (ekce) fgrcVar2.Q();
            }
            this.g.k(ekceVar);
            this.g.setId(ehytVar2.a());
            this.g.f().setTextColor(m);
            this.g.e().setOnClickListener(this);
            ehrl.b(this.g.e(), ekceVar.c, this.h);
            this.d.addView(this.g.e());
        }
        if (this.d.getChildCount() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            marginLayoutParams.bottomMargin = marginLayoutParams.topMargin;
            this.i.setLayoutParams(marginLayoutParams);
        }
    }

    public final void a(fdgz fdgzVar, ehyt ehytVar, eihg eihgVar, boolean z) {
        this.k = fdgzVar;
        this.j = eihgVar;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (!z) {
            this.a.setVisibility(0);
        }
        int a = fdgx.a(fdgzVar.h);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 2 && i != 3) {
            c(fdgzVar, eijr.b(getContext(), com.google.android.gms.R.attr.colorAccent), from, ehytVar);
        } else {
            if (!z) {
                c(fdgzVar, eijr.b(getContext(), com.google.android.gms.R.attr.walletCardViewPageErrorColor), from, ehytVar);
                return;
            }
            int color = getResources().getColor(R.color.white);
            c(fdgzVar, color, from, ehytVar);
            this.c.v(color);
        }
    }

    @Override // defpackage.ehrh
    public final void kH() {
        eifv eifvVar = this.g;
        if (eifvVar != null) {
            View e = eifvVar.e();
            ekce ekceVar = this.k.f;
            if (ekceVar == null) {
                ekceVar = ekce.a;
            }
            ehrl.c(e, ekceVar.c, this.h);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f) {
            fdha fdhaVar = this.k.d;
            if (fdhaVar == null) {
                fdhaVar = fdha.a;
            }
            if (fdhaVar.b != 2 || ((fgpr) fdhaVar.c).d() <= 0) {
                if ((fdhaVar.b == 3 ? (String) fdhaVar.c : "").isEmpty()) {
                    return;
                }
                getContext().startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(fdhaVar.b == 3 ? (String) fdhaVar.c : "")));
            } else {
                Bundle bundle = new Bundle();
                bundle.putByteArray("EventListener.EXTRA_ALERT_ACTION_TOKEN", (fdhaVar.b == 2 ? (fgpr) fdhaVar.c : fgpr.b).M());
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
        eijr.N(this, z);
    }

    public AlertMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlertMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
