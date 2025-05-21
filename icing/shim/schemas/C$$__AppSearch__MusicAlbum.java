package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.acx;
import defpackage.ada;
import defpackage.ade;
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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__MusicAlbum, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__MusicAlbum implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("MusicAlbum");
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
        ada adaVar2 = new ada("byArtist", "MusicGroup");
        adaVar2.c(2);
        adaVar2.a = false;
        adaVar2.d("name");
        acxVar.c(adaVar2.a());
        adh adhVar4 = new adh("image");
        adhVar4.b(2);
        adhVar4.e(0);
        adhVar4.c(0);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        ade adeVar = new ade("numTracks");
        adeVar.b(2);
        adeVar.c(0);
        acxVar.c(adeVar.a());
        ada adaVar3 = new ada("track", "MusicRecording");
        adaVar3.c(1);
        adaVar3.a = false;
        adaVar3.d("name");
        acxVar.c(adaVar3.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        MusicAlbum musicAlbum = (MusicAlbum) obj;
        ado adoVar = new ado(musicAlbum.q, musicAlbum.p, "MusicAlbum");
        adoVar.b("name", musicAlbum.r);
        List b = musicAlbum.b();
        int i = 0;
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = musicAlbum.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(musicAlbum.s));
        MusicGroup musicGroup = musicAlbum.a;
        if (musicGroup != null) {
            adoVar.a("byArtist", adp.e(musicGroup));
        }
        adoVar.b("image", musicAlbum.b);
        adoVar.j("numTracks", musicAlbum.c);
        List list = musicAlbum.d;
        if (list != null) {
            adp[] adpVarArr = new adp[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adpVarArr[i] = adp.e((MusicRecording) it.next());
                i++;
            }
            adoVar.a("track", adpVarArr);
        }
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        String k = adpVar.k();
        String l = adpVar.l();
        String[] t = adpVar.t("name");
        ArrayList arrayList = null;
        String str = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = adpVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = adpVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adp f = adpVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, admVar) : null;
        adp f2 = adpVar.f("byArtist");
        MusicGroup musicGroup = f2 != null ? (MusicGroup) f2.j(MusicGroup.class, admVar) : null;
        String[] t4 = adpVar.t("image");
        String str2 = (t4 == null || t4.length == 0) ? null : t4[0];
        long c = adpVar.c("numTracks");
        adp[] s = adpVar.s("track");
        if (s != null) {
            arrayList = new ArrayList(s.length);
            for (adp adpVar2 : s) {
                arrayList.add((MusicRecording) adpVar2.j(MusicRecording.class, admVar));
            }
        }
        return new MusicAlbum(l, k, str, asList, asList2, musicGroup, str2, c, arrayList, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "MusicAlbum";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(MusicGroup.class);
        arrayList.add(MusicRecording.class);
        return arrayList;
    }
}
