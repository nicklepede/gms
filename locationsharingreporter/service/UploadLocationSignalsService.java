package com.google.android.gms.locationsharingreporter.service;

import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fwty;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class UploadLocationSignalsService extends GmsTaskBoundService {
    private static final ausn a = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);

    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int d(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharingreporter.service.UploadLocationSignalsService.d(android.content.Context, java.lang.String):int");
    }

    private static int e(Exception exc, fwty fwtyVar) {
        ((eluo) ((eluo) ((eluo) a.j()).s(exc)).ai(5730)).z("Failed in RPC with error code %s", fwtyVar.r);
        int ordinal = fwtyVar.ordinal();
        return (ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 16 || ordinal == 13 || ordinal == 14) ? 1 : 2;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!"uploadLocationSignals".equals(caufVar.a)) {
            ((eluo) ((eluo) a.h()).ai((char) 5733)).x("unknown task tag");
            return 2;
        }
        Bundle bundle = caufVar.b;
        String string = bundle != null ? bundle.getString("accountName") : null;
        if (string != null) {
            return d(this, string);
        }
        ((eluo) ((eluo) a.h()).ai((char) 5732)).x("scheduled location signal upload with null account name");
        return 2;
    }
}
