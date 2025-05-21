package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.acx;
import defpackage.ada;
import defpackage.adh;
import defpackage.adj;
import defpackage.adk;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__MusicGroup, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__MusicGroup implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("MusicGroup");
        adh adhVar = new adh("name");
        adhVar.b(2);
        adhVar.e(1);
        adhVar.c(2);
        adhVar.d(0);
        acxVar.c(adhVar.a());
        adh adhVar2 = new adh("keywords");
        adhVar2.b(1);
        adhVar2.e(1);
        adhVar2.c(2);
        adhVar2.d(0);
        acxVar.c(adhVar2.a());
        adh adhVar3 = new adh("alternateName");
        adhVar3.b(1);
        adhVar3.e(1);
        adhVar3.c(2);
        adhVar3.d(0);
        acxVar.c(adhVar3.a());
        ada adaVar = new ada("g3attrinfo", "G3AttributionInfo");
        adaVar.c(2);
        adaVar.a = true;
        acxVar.c(adaVar.a());
        ada adaVar2 = new ada("track", "MusicRecording");
        adaVar2.c(1);
        adaVar2.a = false;
        adaVar2.d("name");
        acxVar.c(adaVar2.a());
        ada adaVar3 = new ada("album", "MusicAlbum");
        adaVar3.c(1);
        adaVar3.a = false;
        adaVar3.d("name");
        acxVar.c(adaVar3.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        MusicGroup musicGroup = (MusicGroup) obj;
        ado adoVar = new ado(musicGroup.q, musicGroup.p, "MusicGroup");
        adoVar.b("name", musicGroup.r);
        List b = musicGroup.b();
        int i = 0;
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = musicGroup.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(musicGroup.s));
        List list = musicGroup.a;
        if (list != null) {
            adp[] adpVarArr = new adp[list.size()];
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                adpVarArr[i2] = adp.e((MusicRecording) it.next());
                i2++;
            }
            adoVar.a("track", adpVarArr);
        }
        List list2 = musicGroup.b;
        if (list2 != null) {
            adp[] adpVarArr2 = new adp[list2.size()];
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                adpVarArr2[i] = adp.e((MusicAlbum) it2.next());
                i++;
            }
            adoVar.a("album", adpVarArr2);
        }
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        ArrayList arrayList;
        String k = adpVar.k();
        String l = adpVar.l();
        String[] t = adpVar.t("name");
        ArrayList arrayList2 = null;
        String str = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = adpVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = adpVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adp f = adpVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, admVar) : null;
        adp[] s = adpVar.s("track");
        if (s != null) {
            arrayList = new ArrayList(s.length);
            for (adp adpVar2 : s) {
                arrayList.add((MusicRecording) adpVar2.j(MusicRecording.class, admVar));
            }
        } else {
            arrayList = null;
        }
        adp[] s2 = adpVar.s("album");
        if (s2 != null) {
            arrayList2 = new ArrayList(s2.length);
            for (adp adpVar3 : s2) {
                arrayList2.add((MusicAlbum) adpVar3.j(MusicAlbum.class, admVar));
            }
        }
        return new MusicGroup(l, k, str, asList, asList2, arrayList, arrayList2, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "MusicGroup";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(MusicRecording.class);
        arrayList.add(MusicAlbum.class);
        return arrayList;
    }
}
