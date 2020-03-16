/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book implements Serializable {

    private static final long serialVersionUID = -1597923197;

    private Integer       id;
    private Integer       authorId;
    private Integer       coAuthorId;
    private Integer       detailsId;
    private String        title;
    private Integer       publishedIn;
    private Integer       languageId;
    private String        contentText;
    private byte[]        contentPdf;
    private Integer       recVersion;
    private LocalDateTime recTimestamp;

    public Book() {}

    public Book(Book value) {
        this.id = value.id;
        this.authorId = value.authorId;
        this.coAuthorId = value.coAuthorId;
        this.detailsId = value.detailsId;
        this.title = value.title;
        this.publishedIn = value.publishedIn;
        this.languageId = value.languageId;
        this.contentText = value.contentText;
        this.contentPdf = value.contentPdf;
        this.recVersion = value.recVersion;
        this.recTimestamp = value.recTimestamp;
    }

    public Book(
        Integer       id,
        Integer       authorId,
        Integer       coAuthorId,
        Integer       detailsId,
        String        title,
        Integer       publishedIn,
        Integer       languageId,
        String        contentText,
        byte[]        contentPdf,
        Integer       recVersion,
        LocalDateTime recTimestamp
    ) {
        this.id = id;
        this.authorId = authorId;
        this.coAuthorId = coAuthorId;
        this.detailsId = detailsId;
        this.title = title;
        this.publishedIn = publishedIn;
        this.languageId = languageId;
        this.contentText = contentText;
        this.contentPdf = contentPdf;
        this.recVersion = recVersion;
        this.recTimestamp = recTimestamp;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.ID</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.AUTHOR_ID</code>.
     */
    public Integer getAuthorId() {
        return this.authorId;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.AUTHOR_ID</code>.
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.CO_AUTHOR_ID</code>.
     */
    public Integer getCoAuthorId() {
        return this.coAuthorId;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.CO_AUTHOR_ID</code>.
     */
    public void setCoAuthorId(Integer coAuthorId) {
        this.coAuthorId = coAuthorId;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.DETAILS_ID</code>.
     */
    public Integer getDetailsId() {
        return this.detailsId;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.DETAILS_ID</code>.
     */
    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.TITLE</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.TITLE</code>.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.PUBLISHED_IN</code>.
     */
    public Integer getPublishedIn() {
        return this.publishedIn;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.PUBLISHED_IN</code>.
     */
    public void setPublishedIn(Integer publishedIn) {
        this.publishedIn = publishedIn;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.LANGUAGE_ID</code>.
     */
    public Integer getLanguageId() {
        return this.languageId;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.LANGUAGE_ID</code>.
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.CONTENT_TEXT</code>.
     */
    public String getContentText() {
        return this.contentText;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.CONTENT_TEXT</code>.
     */
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.CONTENT_PDF</code>.
     */
    public byte[] getContentPdf() {
        return this.contentPdf;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.CONTENT_PDF</code>.
     */
    public void setContentPdf(byte[] contentPdf) {
        this.contentPdf = contentPdf;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.REC_VERSION</code>.
     */
    public Integer getRecVersion() {
        return this.recVersion;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.REC_VERSION</code>.
     */
    public void setRecVersion(Integer recVersion) {
        this.recVersion = recVersion;
    }

    /**
     * Getter for <code>PUBLIC.BOOK.REC_TIMESTAMP</code>.
     */
    public LocalDateTime getRecTimestamp() {
        return this.recTimestamp;
    }

    /**
     * Setter for <code>PUBLIC.BOOK.REC_TIMESTAMP</code>.
     */
    public void setRecTimestamp(LocalDateTime recTimestamp) {
        this.recTimestamp = recTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book (");

        sb.append(id);
        sb.append(", ").append(authorId);
        sb.append(", ").append(coAuthorId);
        sb.append(", ").append(detailsId);
        sb.append(", ").append(title);
        sb.append(", ").append(publishedIn);
        sb.append(", ").append(languageId);
        sb.append(", ").append(contentText);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(recVersion);
        sb.append(", ").append(recTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
