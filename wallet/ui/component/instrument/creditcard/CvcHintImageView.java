package com.google.android.gms.wallet.ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.chimera.FragmentManager;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.arwb;
import defpackage.ding;
import defpackage.djgw;
import defpackage.djgx;
import defpackage.efdk;
import defpackage.ehzo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CvcHintImageView extends ImageWithCaptionView implements View.OnClickListener {
    public FragmentManager a;
    private String i;
    private String j;
    private ehzo k;
    private djgw l;

    public CvcHintImageView(Context context) {
        super(context);
        setOnClickListener(this);
    }

    private final boolean r() {
        return (this.i == null || this.k == null || this.j == null) ? false : true;
    }

    public final void a(String str, String str2, ehzo ehzoVar) {
        if (arwb.b(this.i, str) && arwb.b(this.j, str2) && arwb.b(this.k, ehzoVar)) {
            return;
        }
        this.i = str;
        this.j = str2;
        this.k = ehzoVar;
        if (r()) {
            o(this.k, ding.o(getContext()));
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
                animate().setListener(new djgx(this, i));
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
        ehzo ehzoVar = this.k;
        djgw djgwVar = new djgw();
        Bundle bundle = new Bundle();
        bundle.putString("hintTitle", str);
        bundle.putString("hintText", str2);
        efdk.j(bundle, "hintImage", ehzoVar);
        djgwVar.setArguments(bundle);
        this.l = djgwVar;
        djgwVar.show(this.a, "cvcHintFragment");
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
