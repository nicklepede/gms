package com.google.android.gms.games;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import defpackage.asfs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GamesContentProviderStub extends asfs {
    @Override // defpackage.asfs
    protected final int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final int b(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final Cursor c(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final Uri d(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final void f() {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final String i() {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final /* bridge */ /* synthetic */ SQLiteOpenHelper j() {
        throw new IllegalStateException("Stub content provider should not be used");
    }

    @Override // defpackage.asfs
    protected final void k() {
        throw new IllegalStateException("Stub content provider should not be used");
    }
}
