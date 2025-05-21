package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.eiif;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class MusicRecording extends Thing {
    public final MusicAlbum a;
    public final MusicGroup b;
    public final MusicPlaylist c;
    public final String d;
    public final String e;

    public MusicRecording(String str, String str2, String str3, List list, List list2, MusicAlbum musicAlbum, MusicGroup musicGroup, MusicPlaylist musicPlaylist, String str4, String str5, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        this.a = musicAlbum;
        this.b = musicGroup;
        this.c = musicPlaylist;
        this.d = eiif.b(str4);
        this.e = eiif.b(str5);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (!(obj instanceof MusicRecording) || !super.equals(obj)) {
            return false;
        }
        MusicRecording musicRecording = (MusicRecording) obj;
        return Objects.equals(this.a, musicRecording.a) && Objects.equals(this.b, musicRecording.b) && Objects.equals(this.c, musicRecording.c) && Objects.equals(this.d, musicRecording.d) && Objects.equals(this.e, musicRecording.e);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        MusicPlaylist musicPlaylist = this.c;
        MusicGroup musicGroup = this.b;
        MusicAlbum musicAlbum = this.a;
        return "MusicRecording{'" + super.toString() + "', musicAlbum=" + String.valueOf(musicAlbum) + ", musicGroup=" + String.valueOf(musicGroup) + ", musicPlaylist=" + String.valueOf(musicPlaylist) + ", albumId='" + this.d + "', artistId='" + this.e + "'}";
    }
}
