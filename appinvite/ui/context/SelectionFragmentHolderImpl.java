package com.google.android.gms.appinvite.ui.context;

import android.os.Bundle;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.GridSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.vtr;
import defpackage.vtx;
import defpackage.vui;
import defpackage.vuj;
import defpackage.vuk;
import defpackage.vul;
import defpackage.vur;
import defpackage.vus;
import defpackage.vuu;
import defpackage.vux;
import defpackage.vwl;
import defpackage.vxd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SelectionFragmentHolderImpl extends vul {
    private vui a;

    private static final void m(Bundle bundle, SectionInfo sectionInfo) {
        sectionInfo.p = bundle.getBoolean("docked");
    }

    @Override // defpackage.vum
    public final bblp a() {
        return new ObjectWrapper(this.a);
    }

    @Override // defpackage.vum
    public final List c() {
        return this.a.A();
    }

    @Override // defpackage.vum
    public final void d(bblp bblpVar) {
        this.a = (vui) ObjectWrapper.a(bblpVar);
    }

    @Override // defpackage.vum
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
        this.a = vui.z(selectionFragmentOptions.a, selectionFragmentOptions.b, arrayList4, selectionFragmentOptions.d, selectionFragmentOptions.n, z3, strArr, false, i3, i2, arrayList2, str, z2, null, null, null, null, z);
    }

    @Override // defpackage.vum
    public final void f(ContactPerson contactPerson) {
        for (ContactPerson contactPerson2 : this.a.A()) {
            if (contactPerson.equals(contactPerson2) || vxd.g(contactPerson, contactPerson2)) {
                vxd.e(contactPerson2, contactPerson);
                vui vuiVar = this.a;
                vuiVar.av.G(contactPerson2);
                vuu vuuVar = vuiVar.aw;
                if (vuuVar != null) {
                    vuuVar.G(contactPerson2);
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.vum
    public final void g(ContactPerson contactPerson) {
        for (ContactPerson contactPerson2 : this.a.A()) {
            if (contactPerson.equals(contactPerson2)) {
                vui vuiVar = this.a;
                vuiVar.E(contactPerson2, 0, vuiVar.y(contactPerson2));
                return;
            }
        }
    }

    @Override // defpackage.vum
    public final void h(int i) {
        vui vuiVar = this.a;
        vuiVar.aC = i;
        vtr vtrVar = vuiVar.aF;
        if (vtrVar != null) {
            vtrVar.c = i;
        }
        vux vuxVar = vuiVar.av;
        if (vuxVar != null) {
            vuxVar.O(vuiVar.aC);
        }
        vuu vuuVar = vuiVar.aw;
        if (vuuVar != null) {
            vuuVar.O(vuiVar.aC);
        }
    }

    @Override // defpackage.vum
    public final void i(int i) {
        vui vuiVar = this.a;
        vuiVar.aD = i;
        vwl vwlVar = vuiVar.au;
        if (vwlVar != null) {
            vwlVar.a(i);
        }
    }

    @Override // defpackage.vum
    public final void j(boolean z) {
        vui vuiVar = this.a;
        vuiVar.aB = z;
        vux vuxVar = vuiVar.av;
        if (vuxVar != null) {
            vuxVar.T(z);
        }
        vuu vuuVar = vuiVar.aw;
        if (vuuVar != null) {
            vuuVar.T(z);
        }
        vtx vtxVar = vuiVar.aG;
        if (vtxVar != null) {
            vtxVar.m = z;
        }
        vtr vtrVar = vuiVar.aF;
        if (vtrVar != null) {
            vtrVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.vum
    public final void k(vuj vujVar) {
        this.a.ag = new vur(vujVar);
    }

    @Override // defpackage.vum
    public final void l(vuk vukVar) {
        this.a.ah = new vus(vukVar);
    }
}
