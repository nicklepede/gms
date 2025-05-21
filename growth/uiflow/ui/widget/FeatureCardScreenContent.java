package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.R;
import com.google.android.gms.growth.uiflow.ui.widget.FeatureCardScreenContent;
import defpackage.bkxl;
import defpackage.bkxm;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.rpq;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FeatureCardScreenContent extends ConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureCardScreenContent(Context context) {
        this(context, null, 0, 6, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureCardScreenContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureCardScreenContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fvbo.f(context, "context");
        ConstraintLayout.inflate(context, R.layout.uiflow_feature_card_content, this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpq.e, 0, 0);
        bkxm.c(this, new fvaq() { // from class: bktf
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                iit iitVar = (iit) obj;
                fvbo.f(iitVar, "$this$modifyConstraints");
                int[] iArr = rpq.a;
                TypedArray typedArray = obtainStyledAttributes;
                String string = typedArray.getString(2);
                if (string != null) {
                    iitVar.m(R.id.uiflow_header_media_container, string);
                }
                if (typedArray.getBoolean(0, false)) {
                    View childAt = ((ScrollView) this.findViewById(R.id.feature_card_content_scroll_view)).getChildAt(0);
                    bkxm.b(iitVar, R.id.feature_card_content_scroll_view, -2);
                    fvbo.c(childAt);
                    bkxl.h(childAt, 0);
                }
                return fuvs.a;
            }
        });
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId != -1) {
            bkxl.f(this, new fvaq() { // from class: bkte
                @Override // defpackage.fvaq
                public final Object a(Object obj) {
                    View view = (View) obj;
                    fvbo.f(view, "$this$addOnGlobalLayoutListener");
                    View findViewById = view.getRootView().findViewById(resourceId);
                    if (findViewById != null) {
                        FeatureCardScreenContent featureCardScreenContent = this;
                        int height = findViewById.getHeight();
                        View findViewById2 = featureCardScreenContent.findViewById(R.id.uiflow_header_media_container);
                        fvbo.e(findViewById2, "findViewById(...)");
                        fvbo.f(findViewById2, "<this>");
                        ViewGroup.MarginLayoutParams a = bkxn.a(findViewById2);
                        final int i2 = height - (a.topMargin + a.bottomMargin);
                        bkxm.c(featureCardScreenContent, new fvaq() { // from class: bktg
                            @Override // defpackage.fvaq
                            public final Object a(Object obj2) {
                                iit iitVar = (iit) obj2;
                                fvbo.f(iitVar, "$this$modifyConstraints");
                                bkxm.b(iitVar, R.id.uiflow_header_media_container, i2);
                                return fuvs.a;
                            }
                        });
                    }
                    return fuvs.a;
                }
            });
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ FeatureCardScreenContent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
