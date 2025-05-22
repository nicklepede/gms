package com.google.android.gms.wallet.ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.chimera.FragmentManager;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.atyq;
import defpackage.dkyr;
import defpackage.dlsp;
import defpackage.dlsq;
import defpackage.ehqn;
import defpackage.ekmu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CvcHintImageView extends ImageWithCaptionView implements View.OnClickListener {
    public FragmentManager a;
    private String i;
    private String j;
    private ekmu k;
    private dlsp l;

    public CvcHintImageView(Context context) {
        super(context);
        setOnClickListener(this);
    }

    private final boolean r() {
        return (this.i == null || this.k == null || this.j == null) ? false : true;
    }

    public final void a(String str, String str2, ekmu ekmuVar) {
        if (atyq.b(this.i, str) && atyq.b(this.j, str2) && atyq.b(this.k, ekmuVar)) {
            return;
        }
        this.i = str;
        this.j = str2;
        this.k = ekmuVar;
        if (r()) {
            o(this.k, dkyr.o(getContext()));
        } else {
            setVisibility(8);
        }
    }

    public final void b(int i, boolean z) {
        if (getVisibility() != i) {
            if (!z) {
                super.setVisibility(i);
                return;
            }
            if (i == 0) {
                b(0, false);
                setAlpha(0.0f);
                animate().alpha(1.0f);
            } else {
                super.setVisibility(0);
                setAlpha(1.0f);
                animate().alpha(0.0f);
                animate().setListener(new dlsq(this, i));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        FragmentManager fragmentManager;
        if (!r() || (fragmentManager = this.a) == null) {
            return;
        }
        if (this.l != null) {
            fragmentManager.beginTransaction().remove(this.l).commit();
        }
        String str = this.i;
        String str2 = this.j;
        ekmu ekmuVar = this.k;
        dlsp dlspVar = new dlsp();
        Bundle bundle = new Bundle();
        bundle.putString("hintTitle", str);
        bundle.putString("hintText", str2);
        ehqn.j(bundle, "hintImage", ekmuVar);
        dlspVar.setArguments(bundle);
        this.l = dlspVar;
        dlspVar.show(this.a, "cvcHintFragment");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        if (true != r()) {
            i = 8;
        }
        b(i, true);
    }

    public CvcHintImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(this);
    }

    public CvcHintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnClickListener(this);
    }
}
