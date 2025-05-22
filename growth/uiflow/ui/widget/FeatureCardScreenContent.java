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
import defpackage.bmrj;
import defpackage.bncp;
import defpackage.bnec;
import defpackage.bned;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.tiy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FeatureCardScreenContent extends ConstraintLayout implements bncp {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureCardScreenContent(Context context) {
        this(context, null, 0, 6, null);
        fxxm.f(context, "context");
    }

    @Override // defpackage.bncp
    public final void g(bmrj bmrjVar) {
        if (bmrj.b()) {
            findViewById(R.id.bottom_padding_space).setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureCardScreenContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureCardScreenContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
        ConstraintLayout.inflate(context, R.layout.uiflow_feature_card_content, this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.e, 0, 0);
        bned.c(this, new fxwo() { // from class: bmzy
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                ikj ikjVar = (ikj) obj;
                fxxm.f(ikjVar, "$this$modifyConstraints");
                int[] iArr = tiy.a;
                TypedArray typedArray = obtainStyledAttributes;
                String string = typedArray.getString(2);
                if (string != null) {
                    ikjVar.n(R.id.uiflow_header_media_container, string);
                }
                if (typedArray.getBoolean(0, false)) {
                    View childAt = ((ScrollView) this.findViewById(R.id.feature_card_content_scroll_view)).getChildAt(0);
                    bned.b(ikjVar, R.id.feature_card_content_scroll_view, -2);
                    fxxm.c(childAt);
                    bnec.i(childAt, 0);
                }
                return fxrq.a;
            }
        });
        final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId != -1) {
            bnec.g(this, new fxwo() { // from class: bmzx
                @Override // defpackage.fxwo
                public final Object a(Object obj) {
                    View view = (View) obj;
                    fxxm.f(view, "$this$addOnGlobalLayoutListener");
                    View findViewById = view.getRootView().findViewById(resourceId);
                    if (findViewById != null) {
                        FeatureCardScreenContent featureCardScreenContent = this;
                        int height = findViewById.getHeight();
                        View findViewById2 = featureCardScreenContent.findViewById(R.id.uiflow_header_media_container);
                        fxxm.e(findViewById2, "findViewById(...)");
                        fxxm.f(findViewById2, "<this>");
                        ViewGroup.MarginLayoutParams a = bnee.a(findViewById2);
                        final int i2 = height - (a.topMargin + a.bottomMargin);
                        bned.c(featureCardScreenContent, new fxwo() { // from class: bmzz
                            @Override // defpackage.fxwo
                            public final Object a(Object obj2) {
                                ikj ikjVar = (ikj) obj2;
                                fxxm.f(ikjVar, "$this$modifyConstraints");
                                bned.b(ikjVar, R.id.uiflow_header_media_container, i2);
                                return fxrq.a;
                            }
                        });
                    }
                    return fxrq.a;
                }
            });
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ FeatureCardScreenContent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
