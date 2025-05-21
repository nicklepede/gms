package com.google.android.gms.appinvite.ui.context;

import android.os.Bundle;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.GridSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azht;
import defpackage.txs;
import defpackage.txy;
import defpackage.tyj;
import defpackage.tyk;
import defpackage.tyl;
import defpackage.tym;
import defpackage.tys;
import defpackage.tyt;
import defpackage.tyv;
import defpackage.tyy;
import defpackage.uam;
import defpackage.ube;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SelectionFragmentHolderImpl extends tym {
    private tyj a;

    private static final void m(Bundle bundle, SectionInfo sectionInfo) {
        sectionInfo.p = bundle.getBoolean("docked");
    }

    @Override // defpackage.tyn
    public final azht a() {
        return new ObjectWrapper(this.a);
    }

    @Override // defpackage.tyn
    public final List c() {
        return this.a.A();
    }

    @Override // defpackage.tyn
    public final void d(azht azhtVar) {
        this.a = (tyj) ObjectWrapper.a(azhtVar);
    }

    @Override // defpackage.tyn
    public final void e(SelectionFragmentOptions selectionFragmentOptions) {
        char c;
        ArrayList arrayList = selectionFragmentOptions.k;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            String string = bundle.getString("type");
            int hashCode = string.hashCode();
            if (hashCode == -1715965556) {
                if (string.equals("selection")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3181382) {
                if (hashCode == 3322014 && string.equals("list")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (string.equals("grid")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
                m(bundle, selectionSectionInfo);
                selectionSectionInfo.a = bundle.getCharSequence("hintText");
                selectionSectionInfo.b = bundle.getBoolean("showCount");
                arrayList2.add(selectionSectionInfo);
            } else if (c == 1 || c == 2) {
                String string2 = bundle.getString("type");
                String string3 = bundle.getString("source");
                LoaderSectionInfo gridSectionInfo = string2.equals("grid") ? new GridSectionInfo(string3) : new ListSectionInfo(string3);
                m(bundle, gridSectionInfo);
                gridSectionInfo.d = bundle.getString("loaderOptions");
                gridSectionInfo.g = bundle.getString("headerText");
                gridSectionInfo.e = bundle.getBoolean("includeInSearch");
                gridSectionInfo.b = bundle.getStringArray("methodOrder");
                arrayList2.add(gridSectionInfo);
            }
        }
        ArrayList arrayList3 = selectionFragmentOptions.c;
        ArrayList arrayList4 = arrayList3 != null ? new ArrayList(arrayList3) : null;
        boolean z = selectionFragmentOptions.m;
        boolean z2 = selectionFragmentOptions.j;
        String str = selectionFragmentOptions.h;
        int i2 = selectionFragmentOptions.g;
        int i3 = selectionFragmentOptions.f;
        String[] strArr = selectionFragmentOptions.e;
        boolean z3 = selectionFragmentOptions.l;
        this.a = tyj.z(selectionFragmentOptions.a, selectionFragmentOptions.b, arrayList4, selectionFragmentOptions.d, selectionFragmentOptions.n, z3, strArr, false, i3, i2, arrayList2, str, z2, null, null, null, null, z);
    }

    @Override // defpackage.tyn
    public final void f(ContactPerson contactPerson) {
        for (ContactPerson contactPerson2 : this.a.A()) {
            if (contactPerson.equals(contactPerson2) || ube.g(contactPerson, contactPerson2)) {
                ube.e(contactPerson2, contactPerson);
                tyj tyjVar = this.a;
                tyjVar.av.G(contactPerson2);
                tyv tyvVar = tyjVar.aw;
                if (tyvVar != null) {
                    tyvVar.G(contactPerson2);
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.tyn
    public final void g(ContactPerson contactPerson) {
        for (ContactPerson contactPerson2 : this.a.A()) {
            if (contactPerson.equals(contactPerson2)) {
                tyj tyjVar = this.a;
                tyjVar.E(contactPerson2, 0, tyjVar.y(contactPerson2));
                return;
            }
        }
    }

    @Override // defpackage.tyn
    public final void h(int i) {
        tyj tyjVar = this.a;
        tyjVar.aC = i;
        txs txsVar = tyjVar.aF;
        if (txsVar != null) {
            txsVar.c = i;
        }
        tyy tyyVar = tyjVar.av;
        if (tyyVar != null) {
            tyyVar.O(tyjVar.aC);
        }
        tyv tyvVar = tyjVar.aw;
        if (tyvVar != null) {
            tyvVar.O(tyjVar.aC);
        }
    }

    @Override // defpackage.tyn
    public final void i(int i) {
        tyj tyjVar = this.a;
        tyjVar.aD = i;
        uam uamVar = tyjVar.au;
        if (uamVar != null) {
            uamVar.a(i);
        }
    }

    @Override // defpackage.tyn
    public final void j(boolean z) {
        tyj tyjVar = this.a;
        tyjVar.aB = z;
        tyy tyyVar = tyjVar.av;
        if (tyyVar != null) {
            tyyVar.T(z);
        }
        tyv tyvVar = tyjVar.aw;
        if (tyvVar != null) {
            tyvVar.T(z);
        }
        txy txyVar = tyjVar.aG;
        if (txyVar != null) {
            txyVar.m = z;
        }
        txs txsVar = tyjVar.aF;
        if (txsVar != null) {
            txsVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.tyn
    public final void k(tyk tykVar) {
        this.a.ag = new tys(tykVar);
    }

    @Override // defpackage.tyn
    public final void l(tyl tylVar) {
        this.a.ah = new tyt(tylVar);
    }
}
