package com.google.android.gms.locationsharingreporter.service;

import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.ftya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class UploadLocationSignalsService extends GmsTaskBoundService {
    private static final asot a = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

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

    private static int e(Exception exc, ftya ftyaVar) {
        ((ejhf) ((ejhf) ((ejhf) a.j()).s(exc)).ah(5716)).z("Failed in RPC with error code %s", ftyaVar.r);
        int ordinal = ftyaVar.ordinal();
        return (ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 16 || ordinal == 13 || ordinal == 14) ? 1 : 2;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!"uploadLocationSignals".equals(bylnVar.a)) {
            ((ejhf) ((ejhf) a.h()).ah((char) 5719)).x("unknown task tag");
            return 2;
        }
        Bundle bundle = bylnVar.b;
        String string = bundle != null ? bundle.getString("accountName") : null;
        if (string != null) {
            return d(this, string);
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 5718)).x("scheduled location signal upload with null account name");
        return 2;
    }
}
