package com.google.android.gms.significantplaces.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bsxe;
import defpackage.cauf;
import defpackage.desv;
import defpackage.desw;
import defpackage.eluo;
import defpackage.fxuv;
import defpackage.fyeb;
import defpackage.fyqe;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SettingsLoggingService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        try {
            fxuv fxuvVar = bsxe.a;
            fyqe.d(fyeb.b(bsxe.b), new desv(this, null)).get();
            return 0;
        } catch (InterruptedException e) {
            ((eluo) ((eluo) desw.a.j()).s(e)).x("Failed to log significant places settings");
            return 2;
        } catch (ExecutionException e2) {
            ((eluo) ((eluo) desw.a.j()).s(e2)).x("Failed to log significant places settings");
            return 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0046, code lost:
    
        if (r15 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.fxun r15) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.significantplaces.service.SettingsLoggingService.d(fxun):java.lang.Object");
    }
}
