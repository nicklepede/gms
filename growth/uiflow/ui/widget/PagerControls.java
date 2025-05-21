package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.growth.ui.widget.pageindicator.PageIndicator;
import defpackage.bkkt;
import defpackage.bkvd;
import defpackage.bkvz;
import defpackage.dogs;
import defpackage.fowd;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PagerControls extends RelativeLayout implements bkvz {
    public PageIndicator a;
    public View b;
    public View c;
    public boolean d;
    public dogs e;
    public TextView f;
    public String g;
    public String h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerControls(Context context) {
        this(context, null, 0, 6, null);
        fvbo.f(context, "context");
    }

    @Override // defpackage.bkvz
    public final void a(bkkt bkktVar) {
        boolean j = fowd.a.a().j();
        this.d = j;
        if (j) {
            RelativeLayout.inflate(getContext(), R.layout.pager_controls_bc25, this);
        } else {
            RelativeLayout.inflate(getContext(), R.layout.pager_controls, this);
        }
        if (!this.d) {
            View findViewById = findViewById(R.id.pager_controls_next_text);
            fvbo.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f = (TextView) findViewById;
        }
        this.a = (PageIndicator) findViewById(R.id.pager_controls_indicator);
        View findViewById2 = findViewById(R.id.pager_controls_next);
        this.b = findViewById2;
        View view = null;
        if (findViewById2 == null) {
            fvbo.j("nextButton");
            findViewById2 = null;
        }
        bkvd.a(findViewById2);
        View findViewById3 = findViewById(R.id.pager_controls_prev);
        this.c = findViewById3;
        if (findViewById3 == null) {
            fvbo.j("prevButton");
        } else {
            view = findViewById3;
        }
        bkvd.a(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fvbo.f(context, "context");
    }

    public /* synthetic */ PagerControls(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
