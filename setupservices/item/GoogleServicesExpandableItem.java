package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.ExpandableSwitchItem;
import defpackage.dcdy;
import defpackage.dcem;
import defpackage.dcfd;
import defpackage.dcfm;
import defpackage.edeo;
import defpackage.edeq;
import defpackage.edhd;
import defpackage.edjl;
import defpackage.edjp;
import defpackage.edjs;
import defpackage.esxx;
import defpackage.esyb;
import defpackage.esye;
import defpackage.esyq;
import defpackage.esyr;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GoogleServicesExpandableItem extends ExpandableSwitchItem implements dcdy, edhd {
    public static final /* synthetic */ int d = 0;
    public dcem a;
    public dcem b;
    public dcem c;
    private dcem q;
    private dcem r;
    private final Context s;
    private final int t;
    private final boolean u;
    private final boolean v;

    public GoogleServicesExpandableItem(Context context, int i, boolean z, boolean z2, boolean z3) {
        super(context, z2);
        this.t = i;
        this.u = z2;
        this.v = z3;
        this.s = context;
        int i2 = edjs.a;
        if (edeq.s(context)) {
            return;
        }
        if (z3) {
            D(true != z ? R.layout.setupservices_items_expandable_compact_item : R.layout.setupservices_items_expandable_compact_item_with_blue_chip);
            return;
        }
        if (z2) {
            if (z) {
                D(R.layout.sud_items_expandable_switch_with_blue_chip);
                return;
            }
            z = false;
        }
        if (z2) {
            return;
        }
        D(true != z ? R.layout.setupservices_items_expandable_switch_tinted : R.layout.setupservices_items_expandable_switch_tinted_with_blue_chip);
    }

    @Override // com.google.android.setupdesign.items.ExpandableSwitchItem, com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item, defpackage.edhg
    public final void b(View view) {
        CharSequence k;
        View findViewById;
        super.b(view);
        view.setClickable(false);
        Context context = view.getContext();
        dcfm dcfmVar = dcfm.a;
        if (dcfmVar == null) {
            synchronized (dcfm.class) {
                dcfmVar = dcfm.a;
                if (dcfmVar == null) {
                    dcfmVar = new dcfm(context);
                    dcfm.a = dcfmVar;
                }
            }
        }
        if (dcfmVar.b && (findViewById = view.findViewById(R.id.sud_items_icon_container)) != null) {
            findViewById.setVisibility(8);
        }
        Context context2 = this.s;
        int i = edjs.a;
        if (edeq.s(context2)) {
            return;
        }
        if (edeq.z(view.getContext())) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sud_items_expandable_switch_content).getParent();
            int paddingBottom = linearLayout.getPaddingBottom();
            if (edeq.h(view.getContext()).u(edeo.CONFIG_ITEMS_DIVIDER_SHOWN) && !edeq.h(view.getContext()).n(view.getContext(), edeo.CONFIG_ITEMS_DIVIDER_SHOWN, true)) {
                paddingBottom = view.getResources().getDimensionPixelSize(R.dimen.item_padding_bottom);
            }
            linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), paddingBottom);
            TextView textView = (TextView) view.findViewById(R.id.sud_items_summary);
            textView.setTextSize(0, view.getResources().getDimensionPixelSize(R.dimen.bc_expandable_switch_item_summary_text_size));
            textView.setLineSpacing(view.getResources().getDimensionPixelSize(R.dimen.bc_expandable_switch_item_summary_line_spacing_extra), textView.getLineSpacingMultiplier());
            if (this.f) {
                dcem dcemVar = this.c;
                k = dcemVar == null ? k() : TextUtils.concat(this.b.a, dcemVar.a);
            } else {
                k = k();
            }
            if (k != null) {
                textView.setContentDescription(k);
            }
        } else if (this.u) {
            View findViewById2 = view.findViewById(R.id.sud_items_expandable_switch_content);
            findViewById2.setPaddingRelative(findViewById2.getPaddingStart(), findViewById2.getPaddingTop(), view.getResources().getDimensionPixelSize(R.dimen.item_padding_end), findViewById2.getPaddingBottom());
            if (view != null) {
                Context context3 = view.getContext();
                boolean u = edeq.h(context3).u(edeo.CONFIG_LAYOUT_MARGIN_END);
                if (edjp.e(view)) {
                    int a = u ? (int) edeq.h(context3).a(context3, edeo.CONFIG_LAYOUT_MARGIN_END) : view.getPaddingEnd();
                    if (a != view.getPaddingEnd()) {
                        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{R.attr.listPreferredItemPaddingRight});
                        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                        obtainStyledAttributes.recycle();
                        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a - dimensionPixelSize, view.getPaddingBottom());
                    }
                }
            }
        }
        boolean z = this.v;
        if (z || !this.u) {
            boolean z2 = this.u;
            View findViewById3 = view.findViewById(R.id.sud_items_switch);
            int i2 = true != z2 ? 8 : 0;
            if (findViewById3 != null) {
                findViewById3.setVisibility(i2);
            }
            View findViewById4 = view.findViewById(R.id.sud_items_switch_divider);
            if (findViewById4 != null) {
                findViewById4.setVisibility(i2);
            }
            if (z) {
                TextView textView2 = (TextView) view.findViewById(R.id.sud_items_show_more);
                if (textView2 != null) {
                    if (this.f) {
                        textView2.setText(R.string.setupservices_google_services_item_button_show_less);
                    } else {
                        textView2.setText(R.string.setupservices_google_services_item_button_show_more);
                    }
                }
                edjl.b(view.findViewById(R.id.sud_items_expandable_switch_title_container));
            }
        }
    }

    @Override // defpackage.dcdy
    public final int c() {
        return this.t;
    }

    @Override // defpackage.dcdy
    public final dcfd i() {
        fecj v = esxx.a.v();
        fecj v2 = esyr.a.v();
        esyq esyqVar = this.o ? esyq.ENABLED : esyq.DISABLED;
        if (!v2.b.L()) {
            v2.U();
        }
        esyr esyrVar = (esyr) v2.b;
        esyrVar.c = esyqVar.d;
        esyrVar.b |= 1;
        esyr esyrVar2 = (esyr) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        esxx esxxVar = (esxx) v.b;
        esyrVar2.getClass();
        esxxVar.d = esyrVar2;
        esxxVar.b |= 2;
        fecj v3 = esye.a.v();
        dcem dcemVar = this.a;
        if (dcemVar != null) {
            esyb d2 = dcemVar.d();
            if (!v3.b.L()) {
                v3.U();
            }
            esye esyeVar = (esye) v3.b;
            d2.getClass();
            esyeVar.d = d2;
            esyeVar.b |= 2;
        }
        dcem dcemVar2 = this.q;
        if (dcemVar2 != null) {
            esyb d3 = dcemVar2.d();
            if (!v3.b.L()) {
                v3.U();
            }
            esye esyeVar2 = (esye) v3.b;
            d3.getClass();
            esyeVar2.e = d3;
            esyeVar2.b |= 4;
        }
        dcem dcemVar3 = this.r;
        if (dcemVar3 != null) {
            esyb d4 = dcemVar3.d();
            if (!v3.b.L()) {
                v3.U();
            }
            esye esyeVar3 = (esye) v3.b;
            d4.getClass();
            esyeVar3.f = d4;
            esyeVar3.b |= 8;
        }
        return new dcfd((esxx) v.Q(), (esye) v3.Q());
    }

    @Override // com.google.android.setupdesign.items.ExpandableSwitchItem
    public final CharSequence j() {
        dcem dcemVar = this.q;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }

    public final CharSequence k() {
        dcem dcemVar = this.b;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence l() {
        dcem dcemVar = this.a;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }

    public final void m(dcem dcemVar) {
        this.q = dcemVar;
        o();
    }

    public final void n(dcem dcemVar) {
        this.r = dcemVar;
        o();
    }

    public final void o() {
        dcem dcemVar = this.r;
        if (dcemVar != null) {
            B(TextUtils.concat(j(), "\n\n", dcemVar.a));
        } else {
            B(j());
        }
    }

    @Override // defpackage.edhd
    public final boolean p() {
        return true;
    }

    @Override // defpackage.edhd
    public final boolean q() {
        return true;
    }
}
