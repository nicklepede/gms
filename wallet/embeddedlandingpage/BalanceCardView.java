package com.google.android.gms.wallet.embeddedlandingpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.eflq;
import defpackage.efud;
import defpackage.efwo;
import defpackage.fasm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BalanceCardView extends CardView {
    public ViewGroup g;
    public InfoMessageView h;
    public TextView i;
    public ViewGroup j;
    public ProgressBar k;
    public InfoMessageView l;
    public InfoMessageView m;
    public ViewGroup n;
    public Button o;
    public final ArrayList p;
    public final ArrayList q;
    public fasm r;
    public eflq s;
    public efud t;
    public int u;

    public BalanceCardView(Context context) {
        super(context);
        this.p = new ArrayList();
        this.q = new ArrayList();
    }

    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.g.removeView((View) arrayList.get(i));
        }
        arrayList.clear();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (ViewGroup) findViewById(R.id.content_view);
        this.h = (InfoMessageView) findViewById(R.id.title);
        this.j = (ViewGroup) findViewById(R.id.progress_bar_container);
        this.i = (TextView) findViewById(R.id.balance);
        this.k = (ProgressBar) findViewById(R.id.progress_bar);
        this.l = (InfoMessageView) findViewById(R.id.progress_bar_completion_condition);
        this.m = (InfoMessageView) findViewById(R.id.progress_bar_status_description);
        this.n = (ViewGroup) findViewById(R.id.sub_title_container);
        this.u = (int) getResources().getDimension(R.dimen.wallet_elp_balance_card_content_margin_large);
        Drawable progressDrawable = this.k.getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            int i = 0;
            while (i < numberOfLayers) {
                drawableArr[i] = layerDrawable.getDrawable(i);
                if (i == 1) {
                    Drawable mutate = drawableArr[1].mutate();
                    drawableArr[1] = mutate;
                    mutate.setTintList(efwo.i(getContext(), R.attr.uicColorMaterialAccent));
                    Drawable drawable = drawableArr[1];
                    i = 1;
                }
                i++;
            }
            this.k.setProgressDrawable(new LayerDrawable(drawableArr));
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        efwo.N(this, z);
    }

    public BalanceCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new ArrayList();
        this.q = new ArrayList();
    }

    public BalanceCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new ArrayList();
        this.q = new ArrayList();
    }
}
