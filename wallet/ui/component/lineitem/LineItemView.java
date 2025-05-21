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
import defpackage.asnf;
import defpackage.asng;
import defpackage.ding;
import defpackage.djeo;
import defpackage.djep;
import defpackage.ehvo;
import defpackage.ehvp;
import defpackage.ehzo;
import defpackage.ehzr;
import defpackage.rpq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LineItemView extends FrameLayout implements djeo {
    ViewGroup a;
    LinearLayout b;
    LinearLayout c;
    TextView d;
    TextView e;
    private ViewGroup f;
    private FifeNetworkImageView g;
    private ehvp h;
    private boolean i;

    public LineItemView(Context context) {
        super(context);
        c(context, null);
    }

    private final int d() {
        int a;
        ehvp ehvpVar = this.h;
        if (ehvpVar == null || (a = ehvo.a(ehvpVar.g)) == 0) {
            return 1;
        }
        return a;
    }

    @Override // defpackage.djeo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ehzo ehzoVar;
        ehvp ehvpVar = (ehvp) obj;
        this.h = ehvpVar;
        Context context = getContext();
        if (ehvpVar.c.isEmpty()) {
            this.d.setVisibility(8);
        } else {
            this.d.setText(ding.k(ehvpVar.c));
            this.d.setVisibility(0);
        }
        this.e.setText(ding.k(ehvpVar.d));
        djep.a(context, this.b, ehvpVar.e, LineItemSubValueView.class);
        this.c.removeAllViews();
        for (ehzr ehzrVar : ehvpVar.f) {
            InfoMessageView infoMessageView = new InfoMessageView(context);
            infoMessageView.s(ehzrVar);
            this.c.addView(infoMessageView);
        }
        LinearLayout linearLayout = this.c;
        linearLayout.setVisibility(linearLayout.getChildCount() == 0 ? 8 : 0);
        if (!ehvpVar.i) {
            this.a.setVisibility(0);
        } else if (ehvpVar.d.isEmpty() && ehvpVar.e.size() == 0) {
            this.a.setVisibility(8);
        } else {
            asnf asnfVar = asng.a;
            this.a.setVisibility(0);
        }
        int d = d() - 1;
        int i = d != 1 ? d != 6 ? d != 8 ? d != 3 ? d != 4 ? R.style.WalletLineItem : R.style.WalletHeroLineItem : R.style.WalletGeneratedLineItem : R.style.WalletSubSectionLineItem : R.style.WalletSidekickLineItem : R.style.WalletHeaderLineItem;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, rpq.s);
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(1, marginLayoutParams.topMargin);
            marginLayoutParams.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(2, marginLayoutParams.bottomMargin);
            setLayoutParams(marginLayoutParams);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, rpq.t);
        ding.E(context, this.d, obtainStyledAttributes2.getResourceId(6, R.style.WalletLineItemText));
        ding.E(context, this.e, obtainStyledAttributes2.getResourceId(7, R.style.WalletLineItemValueText));
        int resourceId = obtainStyledAttributes2.getResourceId(5, R.style.WalletLineItemSubValueText);
        int childCount = this.b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.b.getChildAt(i2);
            if (childAt instanceof TextView) {
                ding.E(context, (TextView) childAt, resourceId);
            }
        }
        int resourceId2 = obtainStyledAttributes2.getResourceId(2, R.style.UicDisplayTypeDetailInfoText);
        int childCount2 = this.c.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            ding.D(context, (InfoMessageView) this.c.getChildAt(i3), resourceId2);
        }
        ding.B(context, this.f, obtainStyledAttributes2.getResourceId(3, R.style.WalletLineItemLeftColumn));
        ding.B(context, this.a, obtainStyledAttributes2.getResourceId(4, R.style.WalletLineItemRightColumn));
        if (d() == 7) {
            this.g.getLayoutParams().width = (int) getResources().getDimension(R.dimen.wallet_sidekick_line_item_image_width);
            this.g.getLayoutParams().height = (int) getResources().getDimension(R.dimen.wallet_sidekick_line_item_image_height);
        }
        obtainStyledAttributes2.recycle();
        FifeNetworkImageView fifeNetworkImageView = this.g;
        if (this.i) {
            ehzoVar = null;
        } else {
            ehzoVar = ehvpVar.h;
            if (ehzoVar == null) {
                ehzoVar = ehzo.a;
            }
        }
        ding.y(fifeNetworkImageView, ehzoVar, getContext());
    }

    @Override // defpackage.djeo
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        ehvp ehvpVar = (ehvp) obj;
        return (ehvpVar == null || (ehvpVar.b & 4) == 0) ? false : true;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpq.t);
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
