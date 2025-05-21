package com.google.android.gms.update.phone.layout.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ProportionalOuterFrame extends RelativeLayout {
    private int a;
    private int b;

    public ProportionalOuterFrame(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a = 0;
        this.b = 0;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        Resources resources = getContext().getResources();
        int size = View.MeasureSpec.getSize(i);
        this.a = Math.max(this.a, (int) (View.MeasureSpec.getSize(i2) * resources.getFraction(R.dimen.setup_wizard_title_height_fraction, 1, 1)));
        this.b = Math.max(this.b, (int) (size * resources.getFraction(R.dimen.setup_wizard_border_width_fraction, 1, 1)));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.setup_wizard_margin_bottom);
        int i3 = this.b;
        setPadding(i3, 0, i3, dimensionPixelSize);
        View findViewById = findViewById(R.id.title_area);
        if (findViewById != null) {
            findViewById.setMinimumHeight(this.a);
        }
        super.onMeasure(i, i2);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
