package com.google.android.gms.fonts.prefetch;

import android.content.Context;
import com.google.android.gms.fonts.FontMatchSpec;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bhbg;
import defpackage.bhbi;
import defpackage.bhbr;
import defpackage.bhbz;
import defpackage.bhcb;
import defpackage.bhcc;
import defpackage.bhck;
import defpackage.bhcm;
import defpackage.bhco;
import defpackage.bhdc;
import defpackage.bhde;
import defpackage.bhdp;
import defpackage.byln;
import defpackage.ensj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class EmojiDownloaderBase extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        bhcm.c("EmojiFontDownloader", "Begin emoji downloader oneoff task", new Object[0]);
        Context applicationContext = getApplicationContext();
        FontMatchSpec fontMatchSpec = new FontMatchSpec("Noto COLR Emoji Compat");
        d();
        bhdp bhdpVar = bhdp.a;
        bhdc a = new bhde(bhdpVar.l(applicationContext)).a(fontMatchSpec);
        bhck c = bhdpVar.c(applicationContext);
        bhbi bhbiVar = a.c;
        if (bhbiVar == null) {
            c.c(9, 23510, "com.google.android.gms.fonts.prefetch");
            return 0;
        }
        bhcb j = bhdpVar.j();
        if (j == null) {
            c.c(9, 23502, "com.google.android.gms.fonts.prefetch");
            return 0;
        }
        String c2 = bhcc.c(bhbiVar);
        bhbg bhbgVar = bhbiVar.c;
        if (bhbgVar == null) {
            bhbgVar = bhbg.a;
        }
        ensj.t(j.a(c2, bhbr.a(bhbgVar), bhbz.UPDATE_REQUEST), new bhco(j, bhdpVar.b(applicationContext), a, c), bhdpVar.e());
        return 0;
    }

    protected abstract void d();
}
