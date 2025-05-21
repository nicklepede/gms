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
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__MusicRecording, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__MusicRecording implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("MusicRecording");
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
        ada adaVar2 = new ada("inAlbum", "MusicAlbum");
        adaVar2.c(2);
        adaVar2.a = false;
        adaVar2.d("name");
        acxVar.c(adaVar2.a());
        ada adaVar3 = new ada("byArtist", "MusicGroup");
        adaVar3.c(2);
        adaVar3.a = false;
        adaVar3.d("name");
        acxVar.c(adaVar3.a());
        ada adaVar4 = new ada("inPlaylist", "MusicPlaylist");
        adaVar4.c(2);
        adaVar4.a = false;
        adaVar4.d("name");
        acxVar.c(adaVar4.a());
        adh adhVar4 = new adh("albumId");
        adhVar4.b(2);
        adhVar4.e(0);
        adhVar4.c(0);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        adh adhVar5 = new adh("artistId");
        adhVar5.b(2);
        adhVar5.e(0);
        adhVar5.c(0);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        MusicRecording musicRecording = (MusicRecording) obj;
        ado adoVar = new ado(musicRecording.q, musicRecording.p, "MusicRecording");
        adoVar.b("name", musicRecording.r);
        List b = musicRecording.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = musicRecording.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(musicRecording.s));
        MusicAlbum musicAlbum = musicRecording.a;
        if (musicAlbum != null) {
            adoVar.a("inAlbum", adp.e(musicAlbum));
        }
        MusicGroup musicGroup = musicRecording.b;
        if (musicGroup != null) {
            adoVar.a("byArtist", adp.e(musicGroup));
        }
        MusicPlaylist musicPlaylist = musicRecording.c;
        if (musicPlaylist != null) {
            adoVar.a("inPlaylist", adp.e(musicPlaylist));
        }
        adoVar.b("albumId", musicRecording.d);
        adoVar.b("artistId", musicRecording.e);
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        String k = adpVar.k();
        String l = adpVar.l();
        String[] t = adpVar.t("name");
        String str = null;
        String str2 = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = adpVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = adpVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adp f = adpVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, admVar) : null;
        adp f2 = adpVar.f("inAlbum");
        MusicAlbum musicAlbum = f2 != null ? (MusicAlbum) f2.j(MusicAlbum.class, admVar) : null;
        adp f3 = adpVar.f("byArtist");
        MusicGroup musicGroup = f3 != null ? (MusicGroup) f3.j(MusicGroup.class, admVar) : null;
        adp f4 = adpVar.f("inPlaylist");
        MusicPlaylist musicPlaylist = f4 != null ? (MusicPlaylist) f4.j(MusicPlaylist.class, admVar) : null;
        String[] t4 = adpVar.t("albumId");
        String str3 = (t4 == null || t4.length == 0) ? null : t4[0];
        String[] t5 = adpVar.t("artistId");
        if (t5 != null && t5.length != 0) {
            str = t5[0];
        }
        return new MusicRecording(l, k, str2, asList, asList2, musicAlbum, musicGroup, musicPlaylist, str3, str, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "MusicRecording";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(MusicAlbum.class);
        arrayList.add(MusicGroup.class);
        arrayList.add(MusicPlaylist.class);
        return arrayList;
    }
}
