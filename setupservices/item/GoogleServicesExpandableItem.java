package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.ExpandableSwitchItem;
import defpackage.deoe;
import defpackage.deos;
import defpackage.depj;
import defpackage.deps;
import defpackage.efrj;
import defpackage.efrl;
import defpackage.efty;
import defpackage.efwg;
import defpackage.efwk;
import defpackage.efwn;
import defpackage.evnn;
import defpackage.evnr;
import defpackage.evnu;
import defpackage.evog;
import defpackage.evoh;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GoogleServicesExpandableItem extends ExpandableSwitchItem implements deoe, efty {
    public static final /* synthetic */ int d = 0;
    public deos a;
    public deos b;
    public deos c;
    private deos q;
    private deos r;
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
        int i2 = efwn.a;
        if (efrl.s(context)) {
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

    @Override // com.google.android.setupdesign.items.ExpandableSwitchItem, com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item, defpackage.efub
    public final void b(View view) {
        CharSequence k;
        View findViewById;
        super.b(view);
        view.setClickable(false);
        Context context = view.getContext();
        deps depsVar = deps.a;
        if (depsVar == null) {
            synchronized (deps.class) {
                depsVar = deps.a;
                if (depsVar == null) {
                    depsVar = new deps(context);
                    deps.a = depsVar;
                }
            }
        }
        if (depsVar.b && (findViewById = view.findViewById(R.id.sud_items_icon_container)) != null) {
            findViewById.setVisibility(8);
        }
        Context context2 = this.s;
        int i = efwn.a;
        if (efrl.s(context2)) {
            return;
        }
        if (efrl.z(view.getContext())) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sud_items_expandable_switch_content).getParent();
            int paddingBottom = linearLayout.getPaddingBottom();
            efrl h = efrl.h(view.getContext());
            efrj efrjVar = efrj.CONFIG_ITEMS_DIVIDER_SHOWN;
            if (h.u(efrjVar) && !efrl.h(view.getContext()).n(view.getContext(), efrjVar, true)) {
                paddingBottom = view.getResources().getDimensionPixelSize(R.dimen.item_padding_bottom);
            }
            linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), paddingBottom);
            TextView textView = (TextView) view.findViewById(R.id.sud_items_summary);
            textView.setTextSize(0, view.getResources().getDimensionPixelSize(R.dimen.bc_expandable_switch_item_summary_text_size));
            textView.setLineSpacing(view.getResources().getDimensionPixelSize(R.dimen.bc_expandable_switch_item_summary_line_spacing_extra), textView.getLineSpacingMultiplier());
            if (this.f) {
                deos deosVar = this.c;
                k = deosVar == null ? k() : TextUtils.concat(this.b.a, deosVar.a);
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
                efrl h2 = efrl.h(context3);
                efrj efrjVar2 = efrj.CONFIG_LAYOUT_MARGIN_END;
                boolean u = h2.u(efrjVar2);
                if (efwk.e(view)) {
                    int a = u ? (int) efrl.h(context3).a(context3, efrjVar2) : view.getPaddingEnd();
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
                efwg.b(view.findViewById(R.id.sud_items_expandable_switch_title_container));
            }
        }
    }

    @Override // defpackage.deoe
    public final int c() {
        return this.t;
    }

    @Override // defpackage.deoe
    public final depj i() {
        fgrc v = evnn.a.v();
        fgrc v2 = evoh.a.v();
        evog evogVar = this.o ? evog.ENABLED : evog.DISABLED;
        if (!v2.b.L()) {
            v2.U();
        }
        evoh evohVar = (evoh) v2.b;
        evohVar.c = evogVar.d;
        evohVar.b |= 1;
        evoh evohVar2 = (evoh) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        evnn evnnVar = (evnn) v.b;
        evohVar2.getClass();
        evnnVar.d = evohVar2;
        evnnVar.b |= 2;
        fgrc v3 = evnu.a.v();
        deos deosVar = this.a;
        if (deosVar != null) {
            evnr d2 = deosVar.d();
            if (!v3.b.L()) {
                v3.U();
            }
            evnu evnuVar = (evnu) v3.b;
            d2.getClass();
            evnuVar.d = d2;
            evnuVar.b |= 2;
        }
        deos deosVar2 = this.q;
        if (deosVar2 != null) {
            evnr d3 = deosVar2.d();
            if (!v3.b.L()) {
                v3.U();
            }
            evnu evnuVar2 = (evnu) v3.b;
            d3.getClass();
            evnuVar2.e = d3;
            evnuVar2.b |= 4;
        }
        deos deosVar3 = this.r;
        if (deosVar3 != null) {
            evnr d4 = deosVar3.d();
            if (!v3.b.L()) {
                v3.U();
            }
            evnu evnuVar3 = (evnu) v3.b;
            d4.getClass();
            evnuVar3.f = d4;
            evnuVar3.b |= 8;
        }
        return new depj((evnn) v.Q(), (evnu) v3.Q());
    }

    @Override // com.google.android.setupdesign.items.ExpandableSwitchItem
    public final CharSequence j() {
        deos deosVar = this.q;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }

    public final CharSequence k() {
        deos deosVar = this.b;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence l() {
        deos deosVar = this.a;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }

    public final void m(deos deosVar) {
        this.q = deosVar;
        o();
    }

    public final void n(deos deosVar) {
        this.r = deosVar;
        o();
    }

    public final void o() {
        deos deosVar = this.r;
        if (deosVar != null) {
            B(TextUtils.concat(j(), "\n\n", deosVar.a));
        } else {
            B(j());
        }
    }

    @Override // defpackage.efty
    public final boolean p() {
        return true;
    }

    @Override // defpackage.efty
    public final boolean q() {
        return true;
    }
}
