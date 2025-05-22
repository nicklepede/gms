package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.FifeNetworkImageView;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.auqz;
import defpackage.aura;
import defpackage.dkyr;
import defpackage.dlqh;
import defpackage.dlqi;
import defpackage.ekiu;
import defpackage.ekiv;
import defpackage.ekmu;
import defpackage.ekmx;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LineItemView extends FrameLayout implements dlqh {
    ViewGroup a;
    LinearLayout b;
    LinearLayout c;
    TextView d;
    TextView e;
    private ViewGroup f;
    private FifeNetworkImageView g;
    private ekiv h;
    private boolean i;

    public LineItemView(Context context) {
        super(context);
        c(context, null);
    }

    private final int d() {
        int a;
        ekiv ekivVar = this.h;
        if (ekivVar == null || (a = ekiu.a(ekivVar.g)) == 0) {
            return 1;
        }
        return a;
    }

    @Override // defpackage.dlqh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ekmu ekmuVar;
        ekiv ekivVar = (ekiv) obj;
        this.h = ekivVar;
        Context context = getContext();
        if (ekivVar.c.isEmpty()) {
            this.d.setVisibility(8);
        } else {
            this.d.setText(dkyr.k(ekivVar.c));
            this.d.setVisibility(0);
        }
        this.e.setText(dkyr.k(ekivVar.d));
        dlqi.a(context, this.b, ekivVar.e, LineItemSubValueView.class);
        this.c.removeAllViews();
        for (ekmx ekmxVar : ekivVar.f) {
            InfoMessageView infoMessageView = new InfoMessageView(context);
            infoMessageView.s(ekmxVar);
            this.c.addView(infoMessageView);
        }
        LinearLayout linearLayout = this.c;
        linearLayout.setVisibility(linearLayout.getChildCount() == 0 ? 8 : 0);
        if (!ekivVar.i) {
            this.a.setVisibility(0);
        } else if (ekivVar.d.isEmpty() && ekivVar.e.size() == 0) {
            this.a.setVisibility(8);
        } else {
            auqz auqzVar = aura.a;
            this.a.setVisibility(0);
        }
        int d = d() - 1;
        int i = d != 1 ? d != 6 ? d != 8 ? d != 3 ? d != 4 ? R.style.WalletLineItem : R.style.WalletHeroLineItem : R.style.WalletGeneratedLineItem : R.style.WalletSubSectionLineItem : R.style.WalletSidekickLineItem : R.style.WalletHeaderLineItem;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, tiy.r);
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(1, marginLayoutParams.topMargin);
            marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(2, marginLayoutParams.bottomMargin);
            setLayoutParams(marginLayoutParams);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, tiy.s);
        dkyr.E(context, this.d, obtainStyledAttributes2.getResourceId(6, R.style.WalletLineItemText));
        dkyr.E(context, this.e, obtainStyledAttributes2.getResourceId(7, R.style.WalletLineItemValueText));
        int resourceId = obtainStyledAttributes2.getResourceId(5, R.style.WalletLineItemSubValueText);
        int childCount = this.b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.b.getChildAt(i2);
            if (childAt instanceof TextView) {
                dkyr.E(context, (TextView) childAt, resourceId);
            }
        }
        int resourceId2 = obtainStyledAttributes2.getResourceId(2, R.style.UicDisplayTypeDetailInfoText);
        int childCount2 = this.c.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            dkyr.D(context, (InfoMessageView) this.c.getChildAt(i3), resourceId2);
        }
        dkyr.B(context, this.f, obtainStyledAttributes2.getResourceId(3, R.style.WalletLineItemLeftColumn));
        dkyr.B(context, this.a, obtainStyledAttributes2.getResourceId(4, R.style.WalletLineItemRightColumn));
        if (d() == 7) {
            this.g.getLayoutParams().width = (int) getResources().getDimension(R.dimen.wallet_sidekick_line_item_image_width);
            this.g.getLayoutParams().height = (int) getResources().getDimension(R.dimen.wallet_sidekick_line_item_image_height);
        }
        obtainStyledAttributes2.recycle();
        FifeNetworkImageView fifeNetworkImageView = this.g;
        if (this.i) {
            ekmuVar = null;
        } else {
            ekmuVar = ekivVar.h;
            if (ekmuVar == null) {
                ekmuVar = ekmu.a;
            }
        }
        dkyr.y(fifeNetworkImageView, ekmuVar, getContext());
    }

    @Override // defpackage.dlqh
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        ekiv ekivVar = (ekiv) obj;
        return (ekivVar == null || (ekivVar.b & 4) == 0) ? false : true;
    }

    protected final void c(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.wallet_view_line_item, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.line_item_content);
        this.f = (ViewGroup) inflate.findViewById(R.id.line_item_left_column);
        this.a = (ViewGroup) inflate.findViewById(R.id.line_item_right_column);
        this.g = (FifeNetworkImageView) inflate.findViewById(R.id.line_item_image);
        this.b = (LinearLayout) inflate.findViewById(R.id.line_item_sub_values);
        this.c = (LinearLayout) inflate.findViewById(R.id.info_messages);
        this.d = (TextView) inflate.findViewById(R.id.line_item_name);
        this.e = (TextView) inflate.findViewById(R.id.line_item_value);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.s);
        this.i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize >= 0) {
            viewGroup.setMinimumHeight(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public LineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public LineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }

    public LineItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context, attributeSet);
    }
}
