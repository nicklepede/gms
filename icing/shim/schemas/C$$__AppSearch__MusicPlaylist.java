package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.adc;
import defpackage.adf;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import defpackage.adr;
import defpackage.adt;
import defpackage.adu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__MusicPlaylist, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__MusicPlaylist implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("MusicPlaylist");
        adm admVar = new adm("name");
        admVar.b(2);
        admVar.e(1);
        admVar.c(2);
        admVar.d(0);
        adcVar.c(admVar.a());
        adm admVar2 = new adm("keywords");
        admVar2.b(1);
        admVar2.e(1);
        admVar2.c(2);
        admVar2.d(0);
        adcVar.c(admVar2.a());
        adm admVar3 = new adm("alternateName");
        admVar3.b(1);
        admVar3.e(1);
        admVar3.c(2);
        admVar3.d(0);
        adcVar.c(admVar3.a());
        adf adfVar = new adf("g3attrinfo", "G3AttributionInfo");
        adfVar.c(2);
        adfVar.a = true;
        adcVar.c(adfVar.a());
        adf adfVar2 = new adf("track", "MusicRecording");
        adfVar2.c(1);
        adfVar2.a = false;
        adfVar2.d("name");
        adcVar.c(adfVar2.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        MusicPlaylist musicPlaylist = (MusicPlaylist) obj;
        adt adtVar = new adt(musicPlaylist.q, musicPlaylist.p, "MusicPlaylist");
        adtVar.b("name", musicPlaylist.r);
        List b = musicPlaylist.b();
        int i = 0;
        if (b != null) {
            adtVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = musicPlaylist.a();
        if (a != null) {
            adtVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adtVar.a("g3attrinfo", adu.e(musicPlaylist.s));
        List list = musicPlaylist.a;
        if (list != null) {
            adu[] aduVarArr = new adu[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aduVarArr[i] = adu.e((MusicRecording) it.next());
                i++;
            }
            adtVar.a("track", aduVarArr);
        }
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
        String k = aduVar.k();
        String l = aduVar.l();
        String[] t = aduVar.t("name");
        ArrayList arrayList = null;
        String str = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = aduVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = aduVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adu f = aduVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, adrVar) : null;
        adu[] s = aduVar.s("track");
        if (s != null) {
            arrayList = new ArrayList(s.length);
            for (adu aduVar2 : s) {
                arrayList.add((MusicRecording) aduVar2.j(MusicRecording.class, adrVar));
            }
        }
        return new MusicPlaylist(l, k, str, asList, asList2, arrayList, g3AttributionInfo);
    }

    @Override // defpackage.adp
    public final String d() {
        return "MusicPlaylist";
    }

    @Override // defpackage.adp
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(MusicRecording.class);
        return arrayList;
    }
}
