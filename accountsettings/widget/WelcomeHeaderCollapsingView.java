package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.widget.WelcomeHeaderCollapsingView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ebhf;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;
import defpackage.iuo;
import defpackage.rrk;
import defpackage.shy;
import defpackage.tap;
import defpackage.taq;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class WelcomeHeaderCollapsingView extends LinearLayout implements ebhf {
    public shy a;
    public final ViewGroup b;
    public final TextView c;
    public final TextView d;
    public final AccountParticleDisc e;
    public final fuuw f;
    private int g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WelcomeHeaderCollapsingView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        fvbo.f(context, "context");
    }

    public static final void a(View view, String str) {
        iuo.q(view, new taq(str));
    }

    public static final void b(View view, String str) {
        view.setContentDescription(str);
        if (view.getContentDescription() != null) {
            view.setImportantForAccessibility(1);
        } else {
            view.setImportantForAccessibility(2);
        }
    }

    @Override // defpackage.ebha
    public final void K(AppBarLayout appBarLayout, int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        float abs = 1.0f - Math.abs(i / appBarLayout.f());
        double d = abs;
        float pow = (float) Math.pow(d, 3.5d);
        float pow2 = (float) Math.pow(d, 2.0d);
        ViewGroup viewGroup = this.b;
        viewGroup.setAlpha(pow);
        AccountParticleDisc accountParticleDisc = this.e;
        accountParticleDisc.setAlpha(pow);
        float height = accountParticleDisc.getHeight();
        accountParticleDisc.setPivotX(accountParticleDisc.getWidth() / 2.0f);
        accountParticleDisc.setPivotY(height);
        accountParticleDisc.setScaleX(pow2);
        accountParticleDisc.setScaleY(pow2);
        viewGroup.setClickable(abs == 1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeHeaderCollapsingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fvbo.f(context, "context");
        this.g = JGCastService.FLAG_USE_TDLS;
        ((tap) rrk.a(tap.class, context)).g(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.as_welcome_header_collapsing_content, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(R.id.accountSwitchContainer);
        fvbo.e(findViewById, "findViewById(...)");
        this.b = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(R.id.welcomeText);
        fvbo.e(findViewById2, "findViewById(...)");
        this.c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.accountText);
        fvbo.e(findViewById3, "findViewById(...)");
        this.d = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.accountTextContainer);
        fvbo.e(findViewById4, "findViewById(...)");
        View findViewById5 = inflate.findViewById(R.id.collapsing_account_particle_disc);
        fvbo.e(findViewById5, "findViewById(...)");
        this.e = (AccountParticleDisc) findViewById5;
        setOrientation(1);
        setGravity(1);
        this.f = new fuvg(new fvaf() { // from class: tao
            @Override // defpackage.fvaf
            public final Object a() {
                WelcomeHeaderCollapsingView welcomeHeaderCollapsingView = WelcomeHeaderCollapsingView.this;
                shy shyVar = welcomeHeaderCollapsingView.a;
                if (shyVar == null) {
                    fvbo.j("accountParticleDiscUtilsFactory");
                    shyVar = null;
                }
                return shyVar.a(welcomeHeaderCollapsingView.e, true);
            }
        });
    }

    public /* synthetic */ WelcomeHeaderCollapsingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
